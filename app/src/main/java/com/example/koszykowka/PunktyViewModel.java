package com.example.koszykowka;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
public class PunktyViewModel extends ViewModel {
private MutableLiveData<Integer> pkt;

    public MutableLiveData getPkt() {
        if (pkt==null){
            pkt= new MutableLiveData<>();
            pkt.setValue(0);
        }
        return pkt;
    }

    public void setPkt(int p) {
        if(pkt.getValue()!=null){
            pkt.setValue(p);
        }
    }
        public void dodajPkt(int i){
            if(pkt.getValue()!=null){
                pkt.setValue(pkt.getValue()+i);
            }
    }
}
