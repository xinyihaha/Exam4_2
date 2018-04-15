//package com.example.sxy.exam4_2;
//
//import android.view.ActionMode;
//import android.view.Menu;
//import android.view.MenuItem;
//
//public class MyContactAdapter implements ActionMode.Callback{
//    public boolean onCreateActionMode(ActionMode mode, Menu menu){
//        mode.getMenuInflater().inflate(R.menu.contextt,menu);
//        return true;
//    }
//    public boolean onPrepareActionMode(ActionMode mode,Menu menu){
//        return false;
//    }
//    public boolean onActionItemClicked(ActionMode mode, MenuItem item){
//        mode.finish();
//        return true;
//    }
//    public void onDestoryActionMode(ActionMode mode){
//        mode=null;
//    }
//
//}