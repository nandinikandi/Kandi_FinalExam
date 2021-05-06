/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

/**
 *
 * @author Nandini Kandi
 */
public abstract class UserService{
	public User getUser(){
            return null;
		//statements to be executed, to get user information.
	}
	public User createUser(){
            return null;
		//statements to be executed, to create user information in our systems.
	}
	public User updateUser(){
            return null;
		//statements to be executed, to update user information in our systems.
	}
	
	public abstract User checkUserCredit(); //At this point of time, I know I need to do a credit check, but I am not sure how to do it.
	//In this case, I can declare this method as abstract. These methods are just declared, but no code is implemented, to make any creditCheck here.

}

