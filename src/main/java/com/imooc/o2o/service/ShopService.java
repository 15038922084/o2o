package com.imooc.o2o.service;

import java.io.InputStream;

import com.imooc.o2o.dto.ShopExecution;
import com.imooc.o2o.entity.Shop;
import com.imooc.o2o.exceptions.ShopOperationException;

/**
 * ��ӵ��̵Ľӿ�
 * 
 * @author love����
 *
 */
public interface ShopService {
	ShopExecution addShop(Shop shop, InputStream shopImgInputStream, String fileName) throws ShopOperationException;
}
