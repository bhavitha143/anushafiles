package com.java.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamMapExample {
	public static void main(String[] args) {

		
		List<User> userList=new ArrayList<>();
		userList.add(new User(1, "anu", 10, "Anu@gmail.com"));
		userList.add(new User(2, "anusha", 560, "Anusha@gmail.com"));
 		
		List<UserDTO> userDTOList=new ArrayList<>();
		
		for(User use:userList) {
			userDTOList.add(new UserDTO(use.getId(), use.getName(), use.getEmail()));
		}
		for(UserDTO dto:userDTOList) {
			System.out.println(dto);
		}
		
		
		/*
		 * List<User> users= userList.stream().userList.collect(Collectors.toList());
		 * System.out.println(users); }
		 */
	
		/*
		 * List<User> users= (List<User>) userList.stream().map(new Function<User,
		 * UserDTO>() {
		 * 
		 * @Override public UserDTO apply(User user) {
		 * 
		 * return new UserDTO(user.getId(),user.getName(), user.getEmail()); }
		 * 
		 * });
		 */
	
	}}
	class UserDTO{
		private int id;
		private String name;
		private String email;

		@Override
		public String toString() {
			return "User [id=" + id + ", name=" + name + ",  email=" + email + "]";
		}

		public  UserDTO(int id, String name,  String email) {
			this.id = id;
			this.name = name;
			
			this.email = email;
		}

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

		

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
	}
	
	class User {

		private int id;
		private String name;
		private int age;
		private String email;

		@Override
		public String toString() {
			return "User [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + "]";
		}

		public User(int id, String name, int age, String email) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
			this.email = email;
		}

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

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

	}

