package com.tq.tq_music_notification;

import android.content.Context;
import android.widget.Toast;

import com.gsls.gt.GT;

import java.util.ArrayList;

public class TqMusicNotification extends GT.GT_Notification.AnnotationNotification {
    public ArrayList<MusicInfo> urlList;
    public TqMusicNotification(Context ctx, ArrayList<MusicInfo> urlList) {
        super(ctx);
        this.urlList = urlList;
        setLayout1(R.layout.item_notification);
        setLayout2(R.layout.item_notification2);
    }


    @Override
    protected void initView(Context context) {
        super.initView(context);
        //初始化通知栏 必要属性
        setInitData(
                R.mipmap.head1, //设置通知图标
                false,//单击是否取消通知
                true,//锁屏是否显示
                true,//是否用户不可取消通知
                null,//单击意图
                -1,//发送通知时间
                false);//通知栏编号Id

    }

    public static void toast(Context ctx,String msg) {
        Toast.makeText(ctx, msg, Toast.LENGTH_SHORT).show();
    }
}
