package org.elsys.ip.books.service;

import org.elsys.ip.books.model.ReadList;
import org.elsys.ip.books.model.User;
import org.elsys.ip.books.repository.ReadListRepository;
import org.elsys.ip.books.repository.UserRepository;

import java.util.List;

public class UserService {
    private UserRepository userRepository = new UserRepository();
    private ReadListRepository readListRepository = new ReadListRepository();

    public List<User> getUsers(){return userRepository.getUsers();}

    public User addUser(User user){return userRepository.addUser(user);}

    public User getUserById(Integer id){return userRepository.getUserById(id);}

    public User updateUser(Integer userId, User user){return userRepository.updateUser(userId, user);}

    public User deleteUser(Integer id){return userRepository.deleteUser(id);}

    public List<ReadList> getReadList(Integer id){return readListRepository.getReadList(id);}

    public List<ReadList> getByStatus(Integer status){return readListRepository.getByStatus(status);}

    public ReadList addInReadList(ReadList readList){return readListRepository.addInReadList(readList);}

    public ReadList updateReadList(Integer id, ReadList readList){return readListRepository.updateReadList(id, readList);}

    public ReadList deleteReadList(Integer id){return readListRepository.deleteReadList(id);}
}
