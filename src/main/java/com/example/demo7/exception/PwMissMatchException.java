package com.example.demo7.exception;

@SuppressWarnings("serial")
public class PwMissMatchException extends RuntimeException {
public PwMissMatchException(String msg){ super(msg); }
}