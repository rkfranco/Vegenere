public class Vegenere {
    public static String criptografar(String frase, String chave) {
        frase = frase.toUpperCase().replaceAll(" ", "");
        chave = chave.toUpperCase().replaceAll(" ", "");

        int[] chaveNumerica = getChaveNumerica(chave);

        StringBuilder criptografada = new StringBuilder();

        int i = 0;
        while (criptografada.length() < frase.length()) {
            for (int valorChave : chaveNumerica) {
                criptografada.append(criptografarChar(frase.charAt(i++), valorChave));
            }
        }
        return criptografada.toString();
    }

    public static String descriptografar(String frase, String chave) {
        frase = frase.toUpperCase().replaceAll(" ", "");
        chave = chave.toUpperCase().replaceAll(" ", "");

        int[] chaveNumerica = getChaveNumerica(chave);

        StringBuilder descriptografada = new StringBuilder();

        int i = 0;
        while (descriptografada.length() < frase.length()) {
            for (int valorChave : chaveNumerica) {
                descriptografada.append(descriptografarChar(frase.charAt(i++), valorChave));
            }
        }
        return descriptografada.toString();

    }

    private static int[] getChaveNumerica(String chave) {
        int[] chaveNumerica = new int[chave.length()];
        for (int i = 0; i < chave.length(); i++) {
            chaveNumerica[i] = chave.charAt(i) - 65;
        }
        return chaveNumerica;
    }

    private static char descriptografarChar(char letra, int chave) {
        int total = letra - chave;
        if (total < 'A') {
            return (char) ('Z' - ('A' - total) + 1);
        }
        return (char) total;
    }

    private static char criptografarChar(char letra, int chave) {
        int total = letra + chave;
        if (total > 'Z') {
            return (char) ('A' + total - 'Z' - 1);
        }
        return (char) total;
    }
}
