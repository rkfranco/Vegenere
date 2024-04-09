public class Main {
    public static void main(String[] args) {
        final String chave = "DUH";

        String criptografada = Vegenere.criptografar("THEY DRINK THE TEA", chave);
        String descriptografada = Vegenere.descriptografar(criptografada, chave);
        System.out.println("-----------------------------------------------------");
        System.out.println("Mensagem criptografada: " + criptografada);
        System.out.println("----- Resposta correta: WBLBXYLHRWBLWYH");
        System.out.println("-----------------------------------------------------");
        System.out.println("Mensagem descriptografada: " + descriptografada);
        System.out.println("-------- Resposta correta: THEYDRINKTHETEA");
        System.out.println("------------------------END--------------------------");
    }
}