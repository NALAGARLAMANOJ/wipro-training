package com.company.services;

import com.company.dao.CartDao;

public class CartService {

	    CartDao dao = new CartDao();

	    public void addToCart() {
	        dao.addToCart();
	    }

	    public void viewCart() {
	        dao.viewCart();
	    }
	

}
