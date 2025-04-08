package com.rays.exception;

public class DataEntry {
	public static void main(String[] args) throws DuplicateRecordException {
		String stdID = "amit2025";
		String newID = "abhay2025";

		if (stdID == newID) {
			throw new DuplicateRecordException("Duplicate record insertion");
		} else {
			System.out.println("Record inserted Succesfully");
		}
	}

}
