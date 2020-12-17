package com.ManagementUsers.app;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;


import com.ManagementUsers.models.Profile;
import com.ManagementUsers.models.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		ArrayList<Profile> listProfiles = new ArrayList<Profile>();
		ArrayList<User> listUtilisateurs = new ArrayList<User>();
		
		Profile profil = new Profile();
		Profile pr1 = new Profile(profil.getIdProfile(), 3333, "DG");
		Profile pr2 = new Profile(profil.getIdProfile(), 4444, "MN");
		Profile pr3 = new Profile(profil.getIdProfile(), 3333, "CP");
		Profile pr4 = new Profile(profil.getIdProfile(), 4444, "DP");
		Profile pr5 = new Profile(profil.getIdProfile(), 4444, "DRH");
		
		listProfiles.add(pr1);
		listProfiles.add(pr2);
		listProfiles.add(pr3);
		listProfiles.add(pr4);
		listProfiles.add(pr5);
		
		User u = new User();
		User userX = new User(u.getMatricule(),"ahmadi", "said", "ahmadi.said@gmail.com", "0600000006", 5000,  "admin", "admin123", "MN");		
		User userY = new User(u.getMatricule(),"saidi", "mohamed", "mohamed.saidi@gmail.com", "0600000006", 8000, "mohamed", "mohamed000", "DG");

		listUtilisateurs.add(userX);
		listUtilisateurs.add(userY);


		List<Profile> rs = listProfiles.stream()
	    .filter(p-> p.getLibellé() == "MN" || p.getLibellé() == "DG")
	    .collect(Collectors.toList());
	
		for(User user : listUtilisateurs) {
			System.out.println("Salaire initial est : " + user.getSalary());
			for (Profile profile : rs) {
				if(profile.getLibellé().equals("MN")) {
					System.out.println("Augmentation  de salaire d'un Manager:" +user.calculerSalaire(user.getSalary(),8));
				}else if (profile.getLibellé().equals("DG")) {
					System.out.println("Augmentation de salaire d'un  Directeur général:"+user.calculerSalaire(user.getSalary(),15));
				}
				
			}
		}
		
//		User List
	    System.out.println("------------------list utilisateur----------------------- ");
		System.out.println(listUtilisateurs.toString());
		
//		Manager List
		
		List<User> listManager = listUtilisateurs.stream()
				  .filter(lp->lp.getSrvice().equals("MN"))
				  .collect(Collectors.toList());
		  System.out.println("------------------list manager-------------------");
		  for(User user : listManager) {
			  System.out.println(user.toString());
		  }
		
	}

}
