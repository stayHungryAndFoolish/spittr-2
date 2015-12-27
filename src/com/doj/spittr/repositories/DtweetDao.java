/**
 * 
 */
package com.doj.spittr.repositories;

import org.springframework.stereotype.Component;

import com.doj.spittr.entities.Dtweet;
import com.doj.spittr.entities.Dusr;

/**
 * @author Abhishek
 *
 * 
 */
@Component
public interface DtweetDao {
	public String[] readMessage(Dusr loginUsr);
	/**
	 * @param dtweet
	 */
	public void writeMessage(Dtweet dtweet);
}
