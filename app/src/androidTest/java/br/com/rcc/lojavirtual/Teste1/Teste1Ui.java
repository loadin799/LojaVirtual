package br.com.rcc.lojavirtual.Teste1;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import br.com.rcc.lojavirtual.MainActivity;
import br.com.rcc.lojavirtual.Teste1.robot.Teste1Robot;
@RunWith(AndroidJUnit4.class)

public class Teste1Ui {

    @Rule
    public ActivityTestRule<MainActivity>
            mActivityRule = new ActivityTestRule<>(MainActivity.class, false, true);

    @Test
    public void VerificandoElementos(){
        new Teste1Robot()
                .verificarTitulo()
                .verificarFrase()
                .verificarOpcao1()
                .verificarOpcao2()
                .verificarOpcao3()
                .verificarBotaoComprar();

    }

    @Test
    public void EscolhendoOPrimeiro(){
        new Teste1Robot()
                .clicarOpcao1()
                .clicarEmComprar()
                .escolheuOPrimeiro();

    }

    @Test
    public void EscolhendoOSegundo(){
        new Teste1Robot()
                .clicarOpcao2()
                .clicarEmComprar()
                .escolheuOSegundo();

    }

    @Test
    public void EscolhendoOTerceiro(){
        new Teste1Robot()
                .clicarOpcao3()
                .clicarEmComprar()
                .escolheuOTerceiro();

    }

}
