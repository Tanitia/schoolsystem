package com.example.schoolsystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    static class ClientHandler extends Thread {
        private int read;

        // login name; null if not set
        private String login;
        //client location
        private Socket client;
        private PrintWriter out;
        private BufferedReader in;
        public ClientHandler(Socket socket) throws IOException {
            client = socket;
            out = new PrintWriter(client.getOutputStream(), true);
            in = new BufferedReader(
                    new InputStreamReader(client.getInputStream()));
            login = null;
        }

        public void run() {
            try {
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                }
            } catch (IOException e) {
                System.out.println("Exception while connected");
                System.out.println(e.getMessage());
            }
        }
    }
    public static void main(String[]args){
        int portNumber = 8080;
        try (
                //'start' the server
                ServerSocket serverSocket = new ServerSocket(portNumber);
        ) {
            //whilst server is up, check/accept incoming requests from user
            while (true) {
                Socket clientSocket = serverSocket.accept();
                new ClientHandler(clientSocket).start();
            }
        } catch (IOException e) {
            System.out.println("Exception listening for connection on port " +
                    portNumber);
            System.out.println(e.getMessage());
        }
    }
    }


