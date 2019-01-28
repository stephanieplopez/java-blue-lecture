package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Auction {

	private String itemForSale;
	private Bid currentHighBid;
	private List<Bid> allBids;

	//Super class
	public Auction(String itemForSale) {
		this.itemForSale = itemForSale;
		this.currentHighBid = new Bid("", 0);
		allBids = new ArrayList<>();
	}
	
	public boolean placeBid(Bid offeredBid) {
		// put in a list of all the bids
		allBids.add(offeredBid);
		boolean isCurrentWinningBid = false;
		// is the offered big higher than the currentHighBid
		if(offeredBid.getBidAmount() > currentHighBid.getBidAmount()) {
			currentHighBid = offeredBid;
			// if it is the highest bid
			isCurrentWinningBid = true;
		}
		return isCurrentWinningBid;
	}
	
	public Bid getHighBid() {
		return currentHighBid;
	}
	
	public List<Bid> getAllBids() {
		return new ArrayList<>(allBids);
	}

	public String getItemForSale() {
		return itemForSale;
	}
}
