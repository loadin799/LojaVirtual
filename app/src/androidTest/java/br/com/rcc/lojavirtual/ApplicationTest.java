package br.com.rcc.lojavirtual;

import android.app.Application;
import android.support.test.rule.ActivityTestRule;
import android.test.ApplicationTestCase;

import org.junit.Rule;
import org.junit.Test;

import br.com.rcc.lojavirtual.Teste1.robot.Teste1Robot;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

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
                .verificarBotaoComprar()
                .clicarOpcao1()
                .clicarEmComprar();

    }

}