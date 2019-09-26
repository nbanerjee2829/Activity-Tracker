package signIn;

import java.util.ArrayList;

public class Manager {

	User current;
	Database database = new Database();
	
	//Creating the user
	void createUser(String name, String userName, String password, String dOB, String email, String ansOfSecurityQuestion)
	{
		
		database.addUser(name,  userName,  password,  dOB,  email,  ansOfSecurityQuestion);
		System.out.println("created");
	}
	
	//Removing the user
	void removeUser()
	{
		database.removeUser(current);
		current = null;
	}
	
	//Accessing the user
	boolean accessUser(String username, String password)
	{
		System.out.print("accessed");
		User x = validate(username, password);
		if (x != null) {
			current = x;
			return true;
		}
		else {
			return false;
		}
	}
	
	//Adding Friend
	void addFriend(User friend)
	{
		friend.addRequest(current);
	}
	
	//Searching a user
	User search(String user)
	{
		return database.search(user);
	}
	
	//Removing the friend
	void removeFriend(User friend)
	{
		current.removeFriend(friend);
		friend.removeFriend(current);
	}
	
	/*
	 * This funtion cannot be implemented now due to lack of data
	void compare(User, User)
	{
		
	}
	*/
	
	//Validating if the user is in the database
	User validate(String username, String password)
	{
		User toReturn = null;
		System.out.println(database.sample.getUserName());
		/*
		for( int i =0; i<= 5 ; i++)
		   {
			System.out.println(database.users.get(i).getUserName());
			System.out.println(username);
		   }
			
			   if(database.users.get(i).getUserName().equals(username)) {
				   System.out.print("1");
				   if (database.users.get(i).getPassword().equals(password)) {
					   System.out.print("2");
					    toReturn = database.users.get(i);
				   }
		   }
		   }*/
		return toReturn;
	}
}