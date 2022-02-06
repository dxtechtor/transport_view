package dr.dks.transportviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button shivji, hirji, dapsa, mahadev, mahendra, nagneshi, mandora, varsha, bhati, saiparcel, pawan, navjyoti;
    Button choudhary, charbhuja, rinku, omsai;
    TextView txt_title, txt_add1, txt_add2, txt_l1, txt_l2, txt_l3, txt_l4, txt_l5, txt_l6, txt_l7, txt_l8, txt_l9, txt_l10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hirji = findViewById(R.id.hirji);
        shivji = findViewById(R.id.shivji);
        dapsa = findViewById(R.id.dapsa);
        mahadev = findViewById(R.id.mahadev);
        mahendra = findViewById(R.id.mahendra);
        nagneshi = findViewById(R.id.nagneshi);
        mandora = findViewById(R.id.mandora);
        varsha = findViewById(R.id.varsha);
        bhati = findViewById(R.id.bhati);
        saiparcel = findViewById(R.id.sai);
        pawan = findViewById(R.id.pawan);
        navjyoti = findViewById(R.id.navjyoti);

        choudhary = findViewById(R.id.choudhary);
        charbhuja = findViewById(R.id.charhuja);
        rinku = findViewById(R.id.rinku);
        omsai = findViewById(R.id.omsai);

        txt_title = findViewById(R.id.txt_title);
        txt_add1 = findViewById(R.id.txt_add1);
        txt_add2 = findViewById(R.id.txt_add2);
        txt_l1 = findViewById(R.id.txt_l1);
        txt_l2 = findViewById(R.id.txt_l2);
        txt_l3 = findViewById(R.id.txt_l3);
        txt_l4 = findViewById(R.id.txt_l4);
        txt_l5 = findViewById(R.id.txt_l5);
        txt_l6 = findViewById(R.id.txt_l6);
        txt_l7 = findViewById(R.id.txt_l7);
        txt_l8 = findViewById(R.id.txt_l8);
        txt_l9 = findViewById(R.id.txt_l9);
        txt_l10 = findViewById(R.id.txt_l10);

        String local_add = "Transport area,";
        String pwn_courior = "opp. Gaushala Road,";
        String add_choudhary = "gali no. 1,2,1 near Shubhash Medical, Nagarpalika Road, ";
        String add_charbhuja = "near Aastha Medicose, Bheru Chowk Road,";
        String add_omsai = "near Anupam Computers, Jawai Bandh Road, ";
        String add_bhati = "gokulwadi Road, opposite of Hirji House, ";
        String add_rinku = "near Hotel Mansarowar, Jawai Bandh Road, ";
        String local_bus = "Inside main Bus stand,";
        String local_bus_out = "Outside main Bus stand,";
        String local_area = "Sheoganj";
        String sumerpur = "Sumerpur";


        hirji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_title.setText(hirji.getText() + " Goods");
                txt_add1.setText(local_add);
                txt_add2.setText(local_area);
                txt_l1.setText("Sirohi");
                txt_l2.setText("");
                txt_l3.setText("");
                txt_l4.setText("");
                txt_l5.setText("");
                txt_l6.setText("");
                txt_l7.setText("");
                txt_l8.setText("");
                txt_l9.setText("");
                txt_l10.setText("");
            }
        });
        dapsa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_title.setText(dapsa.getText() + " Goods");
                txt_add1.setText(local_add);
                txt_add2.setText(local_area);
                txt_l1.setText("Jalore");
                txt_l2.setText("Ahore");
                txt_l3.setText("Takhatgarh");
                txt_l4.setText("");
                txt_l5.setText("");
                txt_l6.setText("");
                txt_l7.setText("");
                txt_l8.setText("");
                txt_l9.setText("");
                txt_l10.setText("");
            }
        });
        shivji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_title.setText(shivji.getText() + " Goods");
                txt_add1.setText(local_add);
                txt_add2.setText(local_area);
                txt_l1.setText("Falna");
                txt_l2.setText("Bali");
                txt_l3.setText("Sanderao");
                txt_l4.setText("");
                txt_l5.setText("");
                txt_l6.setText("");
                txt_l7.setText("");
                txt_l8.setText("");
                txt_l9.setText("");
                txt_l10.setText("");
            }
        });
        varsha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_title.setText(varsha.getText() + " Cargo");
                txt_add1.setText(local_add);
                txt_add2.setText(local_area);
                txt_l1.setText("Reodar");
                txt_l2.setText("Mandar");
                txt_l3.setText("Bhattana");
                txt_l4.setText("Sirodi");
                txt_l5.setText("Karuti");
                txt_l6.setText("");
                txt_l7.setText("");
                txt_l8.setText("");
                txt_l9.setText("");
                txt_l10.setText("");
            }
        });
        mahadev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_title.setText(mahadev.getText() + " Transport Company");
                txt_add1.setText(local_add);
                txt_add2.setText(local_area);
                txt_l1.setText("Aburoad");
                txt_l2.setText("Mount Abu");
                txt_l3.setText("Pindwara");
                txt_l4.setText("Saroopganj");
                txt_l5.setText("Veerwada");
                txt_l6.setText("Rohida");
                txt_l7.setText("Bharja");
                txt_l8.setText("Jhadoli");
                txt_l9.setText("");
                txt_l10.setText("");
            }
        });
        mandora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_title.setText(mandora.getText() + " Goods");
                txt_add1.setText(local_add);
                txt_add2.setText(local_area);
                txt_l1.setText("Jawal");
                txt_l2.setText("");
                txt_l3.setText("");
                txt_l4.setText("");
                txt_l5.setText("");
                txt_l6.setText("");
                txt_l7.setText("");
                txt_l8.setText("");
                txt_l9.setText("");
                txt_l10.setText("");
            }
        });
        mahendra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_title.setText(mahendra.getText() + " Goods");
                txt_add1.setText(local_add);
                txt_add2.setText(local_area);
                txt_l1.setText("Sewadi");
                txt_l2.setText("Lunawa");
                txt_l3.setText("Nana");
                txt_l4.setText("Beda");
                txt_l5.setText("Bijapur");
                txt_l6.setText("Chamunderi");
                txt_l7.setText("");
                txt_l8.setText("");
                txt_l9.setText("");
                txt_l10.setText("");
            }
        });
        nagneshi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_title.setText(nagneshi.getText() + " Roadlines");
                txt_add1.setText(local_add);
                txt_add2.setText(local_area);
                txt_l1.setText("Rani");
                txt_l2.setText("Bali");
                txt_l3.setText("Sadadi");
                txt_l4.setText("Desuri");
                txt_l5.setText("Ghanerao");
                txt_l6.setText("");
                txt_l7.setText("");
                txt_l8.setText("");
                txt_l9.setText("");
                txt_l10.setText("");
            }
        });
        bhati.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_title.setText(bhati.getText() + " Goods");
                txt_add1.setText(add_bhati);
                txt_add2.setText(local_area);
                txt_l1.setText("Bhinmal");
                txt_l2.setText("");
                txt_l3.setText("");
                txt_l4.setText("");
                txt_l5.setText("");
                txt_l6.setText("");
                txt_l7.setText("");
                txt_l8.setText("");
                txt_l9.setText("");
                txt_l10.setText("");
            }
        });
        saiparcel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_title.setText(saiparcel.getText());
                txt_add1.setText(local_bus);
                txt_add2.setText(local_area);
                txt_l1.setText("Aburoad");
                txt_l2.setText("Mount Abu");
                txt_l3.setText("");
                txt_l4.setText("");
                txt_l5.setText("");
                txt_l6.setText("");
                txt_l7.setText("");
                txt_l8.setText("");
                txt_l9.setText("");
                txt_l10.setText("");
            }
        });
        pawan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_title.setText(pawan.getText());
                txt_add1.setText(pwn_courior);
                txt_add2.setText(local_area);
                txt_l1.setText("Jaipur");
                txt_l2.setText("Jodhpur");
                txt_l3.setText("Pali");
                txt_l4.setText("Udaipur");
                txt_l5.setText("");
                txt_l6.setText("");
                txt_l7.setText("");
                txt_l8.setText("");
                txt_l9.setText("");
                txt_l10.setText("");
            }
        });

        navjyoti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_title.setText(navjyoti.getText());
                txt_add1.setText(local_bus_out);
                txt_add2.setText(local_area);
                txt_l1.setText("Pali");
                txt_l2.setText("Jodhpur");
                txt_l3.setText("");
                txt_l4.setText("");
                txt_l5.setText("");
                txt_l6.setText("");
                txt_l7.setText("");
                txt_l8.setText("");
                txt_l9.setText("");
                txt_l10.setText("");
            }
        });


        choudhary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_title.setText(choudhary.getText() + " Transport");
                txt_add1.setText(add_choudhary);
                txt_add2.setText(sumerpur);
                txt_l1.setText("Paoli");
                txt_l2.setText("");
                txt_l3.setText("");
                txt_l4.setText("");
                txt_l5.setText("");
                txt_l6.setText("");
                txt_l7.setText("");
                txt_l8.setText("");
                txt_l9.setText("");
                txt_l10.setText("");
            }
        });
        charbhuja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_title.setText(charbhuja.getText() + " Transport");
                txt_add1.setText(add_charbhuja);
                txt_add2.setText(sumerpur);
                txt_l1.setText("Raniwada");
                txt_l2.setText("");
                txt_l3.setText("");
                txt_l4.setText("");
                txt_l5.setText("");
                txt_l6.setText("");
                txt_l7.setText("");
                txt_l8.setText("");
                txt_l9.setText("");
                txt_l10.setText("");
            }
        });
        omsai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_title.setText(omsai.getText() + " Tour & Travels");
                txt_add1.setText(add_omsai);
                txt_add2.setText(sumerpur);
                txt_l1.setText("Udaipur");
                txt_l2.setText("");
                txt_l3.setText("");
                txt_l4.setText("");
                txt_l5.setText("");
                txt_l6.setText("");
                txt_l7.setText("");
                txt_l8.setText("");
                txt_l9.setText("");
                txt_l10.setText("");
            }
        });
        rinku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_title.setText(rinku.getText() + " Travels");
                txt_add1.setText(add_rinku);
                txt_add2.setText(sumerpur);
                txt_l1.setText("Bhinmal");
                txt_l2.setText("Raniwada");
                txt_l3.setText("");
                txt_l4.setText("");
                txt_l5.setText("");
                txt_l6.setText("");
                txt_l7.setText("");
                txt_l8.setText("");
                txt_l9.setText("");
                txt_l10.setText("");
            }
        });

        }
    }