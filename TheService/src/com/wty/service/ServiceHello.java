package com.wty.service;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Transaction;

@WebService
public class ServiceHello {

	/**
	 * @param args
	 */
	
	public String getValue(String name){
		return "�ҽУ�"+name;
	}
	
	private Jedis jedis;// ����Ƭ�ͻ�������

	public void startRedis() {
		jedis = new Jedis("127.0.0.1", 6379);
	}

	/**
	 * String��д����
	 * 
	 * @param key
	 * @return
	 */
	public String get(String key) {
		String getStr = jedis.get(key);
		return getStr;
	}

	public String set(String key, String value) {
		String setStr = jedis.set(key, value);
		return setStr;
	}

	/**
	 * hash��д����
	 * 
	 * @param hash
	 * @param key
	 * @return
	 */
	public String hash_get(String key, String field) {
		String getStr = jedis.hget(key, field);
		return getStr;
	}

	public Long hash_set(String key, String field, String value) {
		Long setStr = jedis.hset(key, field, value);
		return setStr;
	}

	/**
	 * hincrby��ֵ����
	 * 
	 * @param key
	 * @param field
	 * @param value
	 * @return
	 */
	public Long hincre(String key, String field, int value) {
		Long incrStr = jedis.hincrBy(key, field, value);
		return incrStr;
	}

	/**
	 * multi�������
	 * 
	 * @return
	 */
	public Transaction multi() {
		Transaction tranOpera = jedis.multi();
		return tranOpera;
	}

	/**
	 * ��0����
	 * @return
	 */
	public String flushDB() {
		String flushOpera = jedis.flushDB();
		return flushOpera;
	}

	/**
	 * ѡ�����ݿ�
	 * @param index
	 * @return
	 */
	public String selectDB(int index) {
		String selectOpera = jedis.select(index);
		return selectOpera;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endpoint.publish("http://219.245.72.20:8080/Service/ServiceHello", new ServiceHello());
		System.out.println("service success!");
	}

}
