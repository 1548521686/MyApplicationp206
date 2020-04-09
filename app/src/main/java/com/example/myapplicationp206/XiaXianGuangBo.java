package com.example.myapplicationp206;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.WindowManager;

public class XiaXianGuangBo extends BroadcastReceiver {

    @Override
    public void onReceive(final Context context, Intent intent) {
        AlertDialog.Builder dialogBuilder=
                new AlertDialog.Builder(context);
        dialogBuilder.setTitle("注意！！！");
        dialogBuilder.setMessage("你的账号在其他地方登录，已经将你强制下线！");
        dialogBuilder.setCancelable(false);
        dialogBuilder.setPositiveButton("OK",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                   ActivityCollector.finishAll();
                   Intent intent = new Intent(context,LoginActivity.class);
                   intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                   context.startActivity(intent);
                    }
                });
        AlertDialog alertDialog=dialogBuilder.create();
        alertDialog.getWindow().setType(WindowManager.LayoutParams.TYPE_SYSTEM_DIALOG);
        alertDialog.show();
    }
}
