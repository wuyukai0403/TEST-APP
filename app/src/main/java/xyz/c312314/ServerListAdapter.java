package xyz.c312314;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ServerListAdapter extends BaseAdapter {
    private Context mContext;
    private static String serverName = "Minecraft Server";

    public ServerListAdapter(Context context) {
        mContext = context;
    }

    public static void setServerName(String text) {
        serverName = text;
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null)
            convertView = LayoutInflater.from(mContext).inflate(R.layout.list_inner, parent, false);
        TextView tv = convertView.findViewById(R.id.server_name);
        tv.setText(serverName);
        TextView tv2 = convertView.findViewById(R.id.lat_ms);
        tv2.setText("114ms");
        tv2.setTextColor(0xff22bf20);
        TextView tv3 = convertView.findViewById(R.id.textView2);
        tv3.setText("Blas Network\nUpgraded 1.14.4");
        return convertView;
    }
}
