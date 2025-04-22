public record CellPhone(String name) {
    public void call(String number) {
        System.out.println("ligando para " + number);
    }

    public void acceptCall(String num) {
        System.out.println("Aceitar chamada de " + num);
    }

    public void startVoiceMail() {
        System.out.println("Deixando uma mensagem");
    }
}
