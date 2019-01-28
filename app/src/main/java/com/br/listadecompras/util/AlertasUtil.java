package com.br.listadecompras.util;

import android.content.Context;
import android.widget.Toast;

public class AlertasUtil {

    public static void toastCurto(Context context, String mensagem){
        Toast.makeText(context, mensagem, Toast.LENGTH_SHORT).show();
    }

    public static void toastLongo(Context context, String mensagem){
        Toast.makeText(context, mensagem, Toast.LENGTH_LONG).show();
    }

}
