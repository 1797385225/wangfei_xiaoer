package com.wangfei.week5.domain;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 
 * @ClassName: Redis 
 * @Description: 编写一个Goods类，共有ID，
 * 商品名称，商品价格，已售百分比，共4个属性。其中价格需要为BigDecimal类型
 * @author: wangfei
 * @date: 2019年10月14日 上午8:51:16
 */
public class Goods implements Serializable{
	
	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = -8972942463454834301L;
	
	
	//id
	private int id;
	//名称
	private String name;
	//价格
	private BigDecimal price;
	//百分比
	private String gooRedis;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getGooRedis() {
		return gooRedis;
	}
	public void setGooRedis(String gooRedis) {
		this.gooRedis = gooRedis;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gooRedis == null) ? 0 : gooRedis.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Goods other = (Goods) obj;
		if (gooRedis == null) {
			if (other.gooRedis != null)
				return false;
		} else if (!gooRedis.equals(other.gooRedis))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", price=" + price + ", gooRedis=" + gooRedis + "]";
	}
	
	
	
	

}
