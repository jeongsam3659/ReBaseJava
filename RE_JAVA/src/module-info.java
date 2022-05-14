module RE_JAVA {
	requires java.se;
	//Java SE가 제공하는 모든 모듈이 필요함.
}

/*

	module-info.java (모듈기술자) 
	 에서 module키워드 다음에 있는 것이 모듈명.
	 JDK 11이후부터는 명령 프롬프트와 같은 명령 라인에서 프로젝트를 실행할 때, 모듈명이 필요합니다.
	 - 1.8이하 버젼은 이 파일이 생성하지 않아도 됩니다.
	 - 이 경우 모듈 기술자를 생성하면 오히려 컴파일 오류가 발생.

*/
