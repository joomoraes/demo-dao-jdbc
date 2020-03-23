package model.dao;

import model.dao.impl.SellerDao_impl_jdbc;

public class DaoFactory {

	public static SellerDao createSellerDao() {
		return new SellerDao_impl_jdbc();
	}
}
