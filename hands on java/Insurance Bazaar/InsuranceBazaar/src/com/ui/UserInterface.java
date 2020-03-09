package com.ui;

import com.utility.*;

import java.util.*;

public class UserInterface {

                public static void main(String[] args) {
                                int n;
                                int id = 0;
                                String name;
                                
                                Scanner sc = new Scanner(System.in);
                                Bazaar b = new Bazaar();
                                System.out.println("Enter the no of Policy names you want to store");
                                n = sc.nextInt();
                                for (int i = 0; i < n; i++) {
                                                System.out.println("Enter the Policy ID");
                                                id = sc.nextInt();
                                                sc.nextLine();
                                                System.out.println("Enter the Policy Name");
                                                name = sc.nextLine();
                                                b.addPolicyDetails(id, name);
                                }

                                b.sorted(b.getPolicyMap());
                                List<Integer> sh=new ArrayList<Integer>();
                                System.out.println("Enter the policy type to be searched");
                                String type=sc.nextLine();
                                sh=b.searchBasedOnPolicyType(type);
                                for(int i:sh){
                                                System.out.println(i);
                                                
                                }
                                sc.close();
                                

                }

}

