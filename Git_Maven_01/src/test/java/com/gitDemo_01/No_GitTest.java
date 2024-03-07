package com.gitDemo_01;

import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class No_GitTest {

	@Test
	public void noGitTest() {
		System.out.println("GitTest01");
		System.out.println("GitTest02");
		System.out.println("GitTest03");
	}
	
	public void noGitIgnore() {
		System.out.println("GitTest04");
		System.out.println("GitTest05");
		System.out.println("GitTest06");
	}
}
