package sduwh.dream.dao;

import java.util.List;

import sduwh.dream.pojo.User;

public interface UserDao {
	public List getUserList();
	public User getUserByID(String userid);
}
