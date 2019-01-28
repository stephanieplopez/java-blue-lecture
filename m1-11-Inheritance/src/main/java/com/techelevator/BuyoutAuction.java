package com.techelevator;

/**
 * This class models an auction with an additional set price (the 'buyout' price) that any bidder 
 * can accept at any time during the auction, thereby immediately ending the auction and winning 
 * the item.  If no bidder chooses to utilize the buyout option before the end of bidding the 
 * highest bidder wins.
 */
public class BuyoutAuction extends Auction {
	
	//Contains it's own private buyoutPrice
	private int buyoutPrice;

	/**
	 * @param description the description of the auction
	 * @param buyoutPrice the set price that immediately wins the auction
	 */
	
	/*
	 * Constructor
	 */

	// requires two items 
	public BuyoutAuction(String itemForSale, int buyoutPrice) {
		// This line references Auction superclass -- once record is created, it stores the information taken from
		// Auction generating itemsForSale
		super(itemForSale);
		this.buyoutPrice = buyoutPrice;
	}
	
	/*
	 * This class overrides the default placeBid behavior of the parent class.
	 * If the offeredBid meets or exceeds the buyout price, the bid is set
	 * to the buyout price and all future bids are ignored.
	 */
	// Tells it to call this class' version instead of instead of superclass -- hides original
	// Needs same method signature -- referencing Bid here
	// Override does not have to be named, but it's a good standard to have 
	@Override
	public boolean placeBid(Bid offeredBid) {
		boolean isCurrentWinningBid = false;
		// Checks buyout price
		if(getHighBid().getBidAmount() < buyoutPrice) {
			if(offeredBid.getBidAmount() >= buyoutPrice) {
				offeredBid = new Bid(offeredBid.getBidder(), buyoutPrice);
			}
			// It's calling the Auction super class and stating that it's not calling it's own, but the super's variable
			// Using general buyout general code
			isCurrentWinningBid = super.placeBid(offeredBid);
		}
		return isCurrentWinningBid;
	}

	public int getBuyoutPrice() {
		return buyoutPrice;
	}

}
