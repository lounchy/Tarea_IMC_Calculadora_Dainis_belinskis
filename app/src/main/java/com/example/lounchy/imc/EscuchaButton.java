package com.example.lounchy.imc;



import android.content.Intent;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;



public class EscuchaButton extends MainActivity implements View.OnClickListener {

    MainActivity activity;
    EditText etAltura;
    EditText etPeso;


    public EscuchaButton(MainActivity activity) {
        this.activity = activity;

    }

    @Override
    public void onClick(View view) {




        switch (view.getId()) {
            case R.id.calcular_button:

                /**
                 *  Detecto los EditText en XML
                 */
                etAltura = (EditText) activity.findViewById(R.id.altura_edit_text);
                etPeso = (EditText) activity.findViewById(R.id.peso_edit_text);

                /**
                 * Defino dos String que captura lo texto introducido en EditText
                 */
                String alturaIntroducida = etAltura.getText().toString();
                String pesoIntroducido = etPeso.getText().toString();



                /**
                 * Si usario no introduce ningun valor entra en bucle.
                 */
                if (alturaIntroducida.trim().equals("") || pesoIntroducido.trim().equals("")) {



                    /**
                     * Construyo el Toast Message
                     */
                    Toast toast=Toast.makeText(activity, R.string.comrueba_peso_altura, Toast.LENGTH_LONG);


                    /**
                     * Defino LinearLayout para poder personalizar el Toast Message
                     */
                    LinearLayout layout = (LinearLayout) toast.getView();


                    if (layout.getChildCount() > 0) {
                        TextView textView = (TextView) layout.getChildAt(0);
                        /**
                         * Personalizo el mensaje. TextAligment center.
                         */
                        textView.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);

                    }
                    /**
                     * El Toast Message aparecera en el centro de pantalla.
                     */
                    toast.setGravity(Gravity.CENTER, 0,0);
                    toast.show();
                    return;

                }

                /**
                 * Convierto de String a int(Cast)
                 */
                float altura = Float.parseFloat(alturaIntroducida);
                float peso = Float.parseFloat(pesoIntroducido);



                if (altura > 100 && altura < 250&& peso > 20 && peso < 200)

                {
                    Intent intent = new Intent(activity, IntentActivity.class);
                    intent.putExtra("resultado", StringUtil.calculaImc(altura, peso));
                    activity.startActivity(intent);
                }
                else
                {
                    /**
                     * Construyo el Toast Message
                     */
                    Toast toast=Toast.makeText(activity, R.string.comrueba_peso_altura, Toast.LENGTH_LONG);

                    /**
                     * Defino LinearLayout para poder personalizar el Toast Message
                     */
                    LinearLayout layout = (LinearLayout) toast.getView();


                    if (layout.getChildCount() > 0) {
                        TextView textView = (TextView) layout.getChildAt(0);
                        /**
                         * Personalizo el mensaje. TextAligment center.
                         */
                        textView.setGravity(Gravity.CENTER_VERTICAL | Gravity.CENTER_HORIZONTAL);

                    }
                    /**
                     * El Toast Message aparecera en el centro de pantalla.
                     */
                    toast.setGravity(Gravity.CENTER, 0,0);
                    toast.show();
                    return;
                }

                break;
            case R.id.volver_button:
                Intent intent = new Intent(activity, MainActivity.class);
                activity.startActivity(intent);
                break;


        }

    }


}
