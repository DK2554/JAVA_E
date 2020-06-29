package com.kh.oop.main;

import com.kh.oop.controller.MemberController;
import com.kh.oop.model.vo.Member;

public class Main {

	public static void main(String[] args) {
		MemberController mc = new MemberController();
		Member m = mc.enrollMember();
		mc.memberPrint();
		mc.memberUpdate(m);

	}

}
