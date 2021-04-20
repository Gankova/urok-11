package com.company;

public class Bank {
    private class CardInfo {
        private  String cardId;
        private int pinCode;
        private int money;
        private int triesCount;// сколько раз ввели пин код неправильно

        // создание общего объекта

        public CardInfo (String cardId, int pinCode, int money){
            this.cardId = cardId;
            this.money = money;
            this.pinCode = pinCode;
        }
    }
    private CardInfo[] database;

    public Bank() {
        this.database = new CardInfo[] {
                new CardInfo("1212",1234, 500),
                new CardInfo("3434",5678, 600),
                new CardInfo("5656",9876, 700),
        };
    }

    public void signIn (String cardId, int pinCode) {};
}
