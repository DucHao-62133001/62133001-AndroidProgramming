package com.hao.monan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MonAnAdapter extends BaseAdapter {
    //
    private ArrayList<MonAn> dsMonAn;
    private LayoutInflater layoutInflater;
    private Context context;

    //Ham Tao
    public MonAnAdapter(ArrayList<MonAn> dsMonAn, Context _context){
        this.dsMonAn = dsMonAn;
        this.context = _context;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return dsMonAn.size();
    }

    @Override
    public Object getItem(int i) {
        return dsMonAn.get(i);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        View viewHienHanh = view;
        if(viewHienHanh == null)
            viewHienHanh= layoutInflater.inflate(R.layout.item_monan, null);
        MonAn monAnHienTai = dsMonAn.get(i);

        TextView textView_TenMon = (TextView) viewHienHanh.findViewById(R.id.tvTenMonAn);
        TextView textView_GiaMon = (TextView) viewHienHanh.findViewById(R.id.tvGiaMonAn);
        ImageView imageView_Anh = (ImageView) viewHienHanh.findViewById(R.id.imAnhDaiDien);

        textView_TenMon.setText(monAnHienTai.getTenMonAn());
        textView_GiaMon.setText(monAnHienTai.getDonGia());
        imageView_Anh.setImageResource(monAnHienTai.getIdAnhMinhHoa());

        return viewHienHanh;


    }
}
