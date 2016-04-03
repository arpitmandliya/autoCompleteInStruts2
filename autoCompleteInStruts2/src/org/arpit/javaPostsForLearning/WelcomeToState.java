package org.arpit.javaPostsForLearning;
import com.opensymphony.xwork2.ActionSupport;
public class WelcomeToState extends ActionSupport{

	public String state;

	public String execute()
	{
		return SUCCESS;
	}
}