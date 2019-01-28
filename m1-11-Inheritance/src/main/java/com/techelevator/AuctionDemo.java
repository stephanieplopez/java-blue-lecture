package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AuctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner(System.in);
		
		
		//Auction auction = new Auction ("Record");
		// Record is being created
		//Auction auction = new BuyoutAuction("Record", 10);
//		Auction auction = new ReserveAuction("Taco", 3);
		
		
		// Checks if object is instance of
//		if (auction instanceof BuyoutAuction) {
//			System.out.println("Auction is a Buyout Auction");
//		}
//		if (auction instanceof Auction) {
//			System.out.println("Auction is a Auction");
//		}

		// This places each item in it's respective class
		List<Auction> myAuctions = new ArrayList<Auction>();
		myAuctions.add(new Auction ("Record"));
		myAuctions.add(new BuyoutAuction ("Book", 10));
		myAuctions.add(new ReserveAuction ("Taco", 3));
		
		// Pulls items placed in myAuctions
		for (Auction auction : myAuctions) {
			
		System.out.println("Buy my " + auction.getItemForSale());
		
		
			System.out.print("Enter your name >>>");
			String bidder = in.nextLine();
			
			System.out.print("Place a bid >>>");
			String amount = in.nextLine();
			
			int bid = Integer.parseInt(amount);
			
			boolean isWinning = auction.placeBid(new Bid(bidder, bid));
			
			
			// Two methods are being called - The Highest Bid and the bidder
			System.out.println(auction.getHighBid().getBidder() +
				" is winning with a bid of " + auction.getHighBid().getBidAmount());
		}
		
	}

}
