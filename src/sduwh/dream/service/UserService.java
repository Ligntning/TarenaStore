package sduwh.dream.service;

import java.util.List;

import sduwh.dream.pojo.User;

public interface UserService {
	public List getUserList();
	public User getUserByID(String userid);
}
