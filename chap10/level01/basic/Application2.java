package com.hanwhaswcamp.chap10.level01.basic;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("생년월일 입력 (yyyy-MM-dd 양식으로 작성) : ");
        String birthdateInput = scanner.nextLine();

        try {
            LocalDate birthdate = LocalDate.parse(birthdateInput);
            checkAge(birthdate);
            System.out.println("입장하셔도 됩니다.");
        } catch (DateTimeParseException e) {
            System.out.println("날짜 양식을 잘못 입력하셨습니다.");
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static class AgeException extends Exception {
        public AgeException(String message) {
            super(message);
        }
    }

    private static void checkAge(LocalDate birthdate) throws AgeException {
        LocalDate today = LocalDate.now();
        int age = today.getYear() - birthdate.getYear();
        if (birthdate.plusYears(age).isAfter(today)) {
            age--;
        }

        if (age < 20) {
            throw new AgeException("만 20세 미만은 입장 불가입니다.");
        }
    }
}
