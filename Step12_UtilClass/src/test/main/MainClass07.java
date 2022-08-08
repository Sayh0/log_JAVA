package test.main;

import java.util.*;

import test.mypac.Member;

public class MainClass07 {
	public static void main(String[] args) {
		List<Member> members=new ArrayList<Member>();
		Member mem1=new Member(1, "김구라", "노량진");
		Member mem2=new Member(2, "해골", "행신동");
		Member mem3=new Member(3, "덩어리", "상도동");
		
		members.add(mem1);
		members.add(mem2);
		members.add(mem3);
				
		for(int i=0; i<members.size(); i++) {
            System.out.println("번호: "+members.get(i).num+
            		          " 이름: "+members.get(i).name+
            		          " 주소: "+members.get(i).addr);
        }
		System.out.println("");
		
		for(Member tmp:members) {
          System.out.println("번호: "+tmp.num+", 이름: "+tmp.name+", 주소: "+tmp.addr);
		}
	}
}