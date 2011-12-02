package jefferson.hello.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class HelloWorldActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Criacao da View
        TextView texto = new TextView(this);
        texto.setText("Hello Android !");
        
        // configura o conteudo de visualizacao
        setContentView(texto);
        
    }
}