package signIn;

import java.util.ArrayList;

public class Database {

	Manager manager;
	public ArrayList<User> users=new ArrayList<User>();
	public User sample;
	
	//Adding the user in the users array list
	void addUser(String name, String userName, String password, String dOB, String email, String ansOfSecurityQuestion)
	{
		//users.add(newUser);
		sample = new User( name,  userName,  password,  dOB,  email,  ansOfSecurityQuestion);
		System.out.println("inData");
	}
	void printM() {
		for (int i = 0; i < users.size(); i++) {
			System.out.println(users.get(i));
		}
	}
	//Removing the user from the users array list
	void removeUser(User user)
	{
		for( int i =0; i< users.size() ; i++)
		   {
			   if(users.get(i)== user)
			   {
				   users.remove(i);
			   }
				   
		   }
	}
	
	//Searching for the user in the database
	User search(String user)
	{
		User found = null;
		int k=0;
	   for( int i =0; i< users.size() ; i++)
	   {
		   if(users.get(i).equals(user))
			   found = users.get(i);
	   }
	   return found;
	   
	}
}