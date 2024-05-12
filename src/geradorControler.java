import java.util.Random;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class geradorControler {

    @FXML
    private Button botaoGerar;

    @FXML
    private TextField campoGerar;

    @FXML
    private Label exibirSenha;

    @FXML
    void gerarSenha(ActionEvent event) {
        int tamanhoSenha = Integer.parseInt(campoGerar.getText());
        String senha = gerarSenha(tamanhoSenha);
        exibirSenha.setText("Senha Gerada: " + senha);
    }

    private String gerarSenha(int tamanhoSenha) {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+=?";
        Random rand = new Random();
        StringBuilder senha = new StringBuilder();

        for (int i = 0; i < tamanhoSenha; i++) {
            int randomSenha = rand.nextInt(caracteres.length());
            senha.append(caracteres.charAt(randomSenha));
        }

        return senha.toString();
    }
}
