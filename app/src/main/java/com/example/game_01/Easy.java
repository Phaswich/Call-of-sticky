package com.example.game_01;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Easy extends AppCompatActivity {

    private int Score = 0;
    private int ScoreEm = 0;
    private int UserLP = 20;
    private int EmLP = 20;
    private int UserAmmor = 0;
    private int EmAmmor = 0;
    private TextView alertTextView;

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Warning");
        builder.setMessage("Are you want to go back??");
        builder.setPositiveButton("Yes", (dialog, which) -> {
            finish();
        });
        builder.setNegativeButton("No", (dialog, which) -> {
            dialog.dismiss();
        });
        builder.show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy);


        final ImageButton Dicebutton = findViewById(R.id.Dice);
        final ImageButton ATKbutton = findViewById(R.id.ATK);
        final ImageButton DEFbutton = findViewById(R.id.DEF);
        final ImageView StatDice = findViewById(R.id.StatDice);
        final ImageView StatDiceEm = findViewById(R.id.StatDiceEm);
        final ImageView STBAR = findViewById(R.id.STBAR);
        final ImageView STEMBAR = findViewById(R.id.STEMBAR);
        final ImageView WinorLose = findViewById(R.id.winorlose);
        final ImageView STemdice = findViewById(R.id.Dicestem);
        final ImageView STdice = findViewById(R.id.Dicest);
        final ImageView enemyLP = findViewById(R.id.EmLP);
        final ImageView userLP = findViewById(R.id.LP);
        final ImageView ModeEm = findViewById(R.id.modeEm2);
        final ImageView ModeUser = findViewById(R.id.mode2);
        final TextView alertTextView = findViewById(R.id.AlertTextView);


        Dicebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int check = 0 ;
                int zero = 0 ;
                int num1 = random.nextInt(6);
                int minus = 0 ;
                Score += num1;
                if(num1 == 0){
                    STdice.setImageResource(R.drawable.scorezero);
                }else if(num1 == 1){
                    STdice.setImageResource(R.drawable.scoreone);
                }else if(num1 == 2){
                    STdice.setImageResource(R.drawable.scoretwo);
                }else if(num1 == 3){
                    STdice.setImageResource(R.drawable.scorethree);
                }else if(num1 == 4){
                    STdice.setImageResource(R.drawable.scorefour);
                }else if(num1 == 5){
                    STdice.setImageResource(R.drawable.scorefive);
                }else if(num1 == 6){
                    STdice.setImageResource(R.drawable.scoresix);
                }else if(num1 == 7){
                    STdice.setImageResource(R.drawable.scoreseven);
                }else if(num1 == 8){
                    STdice.setImageResource(R.drawable.scoreeight);
                }else if(num1 == 9){
                    STdice.setImageResource(R.drawable.scorenine);
                }else if(num1 == 10){
                    STdice.setImageResource(R.drawable.scoreten);
                }else if(num1 == 11){
                    STdice.setImageResource(R.drawable.scoreeleven);
                }else if(num1 == 12){
                    STdice.setImageResource(R.drawable.scoretwele);
                }

                //STdice.setText("Dice : " + num1);



                if(ScoreEm >= 9){
                    //stop dice Enemy
                }else{
                    // do{
                    check =  random.nextInt(6) ;
                    // }while(ScoreEm + check > 12);
                    if(ScoreEm + check > 12){
                        minus = (ScoreEm - Score) + EmAmmor;
                        EmLP += minus ;
                        Score = 0 ;
                        ScoreEm = 0 ;
                        //////////////////////////////////////
                        STdice.setImageResource(R.drawable.scorezero);
                        STemdice.setImageResource(R.drawable.scorezero);
                        // STemdice.setText("Dice : " + zero);
                        // STdice.setText("Dice : " + zero);
                        //////////////////////////////////////

                        enemyLP.setImageResource(R.drawable.twentyhpe);

                        //////////////////////////////////////
                        if(minus == 0){
                            WinorLose.setImageResource(R.drawable.azero);
                        }else if(minus == 1){
                            WinorLose.setImageResource(R.drawable.aone);
                        }else if(minus == 2) {
                            WinorLose.setImageResource(R.drawable.atwo);
                        }else if(minus == 3){
                            WinorLose.setImageResource(R.drawable.athree);
                        }else if(minus == 4){
                            WinorLose.setImageResource(R.drawable.afour);
                        }else if(minus == 5){
                            WinorLose.setImageResource(R.drawable.afive);
                        }else if(minus == 6){
                            WinorLose.setImageResource(R.drawable.asix);
                        }else if(minus == 7){
                            WinorLose.setImageResource(R.drawable.aseven);
                        }else if(minus == 8){
                            WinorLose.setImageResource(R.drawable.aeight);
                        }else if(minus == 9){
                            WinorLose.setImageResource(R.drawable.anine);
                        }else if(minus == 10){
                            WinorLose.setImageResource(R.drawable.aten);
                        }else if(minus == 11){
                            WinorLose.setImageResource(R.drawable.aeleven);
                        }else if(minus == 12){
                            WinorLose.setImageResource(R.drawable.atwele);
                        }

                        //WinorLose.setText("attack " + minus);   //if score Enemy > 12 User win ;
                        //delay 2 second

                        //       WinorLose.setText("Win or Lose");
                        //    Reset();
                    }
                    ///////////////////////////////////////////////////////////

                    if(EmLP == 20){
                        enemyLP.setImageResource(R.drawable.twentyhpe);
                    }
                    else if(EmLP == 19){
                        enemyLP.setImageResource(R.drawable.nineteenhpe);
                    }
                    else if(EmLP == 18){
                        enemyLP.setImageResource(R.drawable.eightteenhpe);
                    }
                    else if(EmLP == 17){
                        enemyLP.setImageResource(R.drawable.seventeenhpe);
                    }
                    else if(EmLP == 16){
                        enemyLP.setImageResource(R.drawable.sixteenhpe);
                    }
                    else if(EmLP == 15){
                        enemyLP.setImageResource(R.drawable.fifteenhpe);
                    }
                    else if(EmLP == 14){
                        enemyLP.setImageResource(R.drawable.fourteenhpe);
                    }
                    else if(EmLP == 13){
                        enemyLP.setImageResource(R.drawable.thirteenhpe);
                    }
                    else if(EmLP == 12){
                        enemyLP.setImageResource(R.drawable.twelehpe);
                    }
                    else if(EmLP == 11){
                        enemyLP.setImageResource(R.drawable.elevenhpe);
                    }
                    else if(EmLP == 10){
                        enemyLP.setImageResource(R.drawable.tenhpe);
                    }
                    else if(EmLP == 9){
                        enemyLP.setImageResource(R.drawable.ninehpe);
                    }
                    else if(EmLP == 8){
                        enemyLP.setImageResource(R.drawable.eighthpe);
                    }
                    else if(EmLP == 7){
                        enemyLP.setImageResource(R.drawable.sevenhpe);
                    }
                    else if(EmLP == 6){
                        enemyLP.setImageResource(R.drawable.sixhpe);
                    }
                    else if(EmLP == 5){
                        enemyLP.setImageResource(R.drawable.fivehpe);
                    }
                    else if(EmLP == 4){
                        enemyLP.setImageResource(R.drawable.fourhpe);
                    }
                    else if(EmLP == 3){
                        enemyLP.setImageResource(R.drawable.threehpe);
                    }
                    else if(EmLP == 2){
                        enemyLP.setImageResource(R.drawable.twohpe);
                    }
                    else if(EmLP == 1){
                        enemyLP.setImageResource(R.drawable.onehpe);
                    }

                    //////////////////////////////////////////////////////////

                    ScoreEm += check ;
                    if(check == 0){
                        STemdice.setImageResource(R.drawable.scorezero);
                    }else if(check == 1){
                        STemdice.setImageResource(R.drawable.scoreone);
                    }else if(check == 2){
                        STemdice.setImageResource(R.drawable.scoretwo);
                    }else if(check == 3){
                        STemdice.setImageResource(R.drawable.scorethree);
                    }else if(check == 4){
                        STemdice.setImageResource(R.drawable.scorefour);
                    }else if(check == 5){
                        STemdice.setImageResource(R.drawable.scorefive);
                    }else if(check == 6){
                        STemdice.setImageResource(R.drawable.scoresix);
                    }else if(check == 7){
                        STemdice.setImageResource(R.drawable.scoreseven);
                    }else if(check == 8){
                        STemdice.setImageResource(R.drawable.scoreeight);
                    }else if(check == 9){
                        STemdice.setImageResource(R.drawable.scorenine);
                    }else if(check == 10){
                        STemdice.setImageResource(R.drawable.scoreten);
                    }else if(check == 11){
                        STemdice.setImageResource(R.drawable.scoreeleven);
                    }else if(check == 12){
                        STemdice.setImageResource(R.drawable.scoretwele);
                    }
                    //STemdice.setText("Dice : " + check);
                }
                if(Score > 12 ){
                    minus = - (ScoreEm) ;
                    UserLP += minus ;
                    Score = 0 ;
                    ScoreEm = 0 ;
                    //////////////////////////////////////
                    STdice.setImageResource(R.drawable.scorezero);
                    STemdice.setImageResource(R.drawable.scorezero);

                    ///////////////////////////////////////////////////////////

                    if(UserLP == 20){
                        userLP.setImageResource(R.drawable.twentyhpe);
                    }
                    else if(UserLP == 19){
                        userLP.setImageResource(R.drawable.nineteenhpe);
                    }
                    else if(UserLP == 18){
                        userLP.setImageResource(R.drawable.eightteenhpe);
                    }
                    else if(UserLP == 17){
                        userLP.setImageResource(R.drawable.seventeenhpe);
                    }
                    else if(UserLP == 16){
                        userLP.setImageResource(R.drawable.sixteenhpe);
                    }
                    else if(UserLP == 15){
                        userLP.setImageResource(R.drawable.fifteenhpe);
                    }
                    else if(UserLP == 14){
                        userLP.setImageResource(R.drawable.fourteenhpe);
                    }
                    else if(UserLP == 13){
                        userLP.setImageResource(R.drawable.thirteenhpe);
                    }
                    else if(UserLP == 12){
                        userLP.setImageResource(R.drawable.twelehpe);
                    }
                    else if(UserLP == 11){
                        userLP.setImageResource(R.drawable.elevenhpe);
                    }
                    else if(UserLP == 10){
                        userLP.setImageResource(R.drawable.tenhpe);
                    }
                    else if(UserLP == 9){
                        userLP.setImageResource(R.drawable.ninehpe);
                    }
                    else if(UserLP == 8){
                        userLP.setImageResource(R.drawable.eighthpe);
                    }
                    else if(UserLP == 7){
                        userLP.setImageResource(R.drawable.sevenhpe);
                    }
                    else if(UserLP == 6){
                        userLP.setImageResource(R.drawable.sixhpe);
                    }
                    else if(UserLP == 5){
                        userLP.setImageResource(R.drawable.fivehpe);
                    }
                    else if(UserLP == 4){
                        userLP.setImageResource(R.drawable.fourhpe);
                    }
                    else if(UserLP == 3){
                        userLP.setImageResource(R.drawable.threehpe);
                    }
                    else if(UserLP == 2){
                        userLP.setImageResource(R.drawable.twohpe);
                    }
                    else if(UserLP == 1){
                        userLP.setImageResource(R.drawable.onehpe);
                    }


                    //////////////////////////////////////////////////////////
                    if((minus * -1 ) == 0){
                        WinorLose.setImageResource(R.drawable.rdzero);
                    }else if((minus * -1 ) == 1){
                        WinorLose.setImageResource(R.drawable.rdone);
                    }else if((minus * -1 ) == 2) {
                        WinorLose.setImageResource(R.drawable.rdtwo);
                    }else if((minus * -1 ) == 3){
                        WinorLose.setImageResource(R.drawable.rdthree);
                    }else if((minus * -1 ) == 4){
                        WinorLose.setImageResource(R.drawable.rdfour);
                    }else if((minus * -1 ) == 5){
                        WinorLose.setImageResource(R.drawable.rdfive);
                    }else if((minus * -1 ) == 6){
                        WinorLose.setImageResource(R.drawable.rdsix);
                    }else if((minus * -1 ) == 7){
                        WinorLose.setImageResource(R.drawable.rdseven);
                    }else if((minus * -1 ) == 8){
                        WinorLose.setImageResource(R.drawable.rdeight);
                    }else if((minus * -1 ) == 9){
                        WinorLose.setImageResource(R.drawable.rdnine);
                    }else if((minus * -1 ) == 10){
                        WinorLose.setImageResource(R.drawable.rdten);
                    }else if((minus * -1 ) == 11){
                        WinorLose.setImageResource(R.drawable.rdeleven);
                    }else if((minus * -1 ) == 12){
                        WinorLose.setImageResource(R.drawable.rdtwele);
                    }
                    // WinorLose.setText("taked damage " + (minus * -1 ));
                    //delay 2 second

                    //    WinorLose.setText("Win or Lose");
                    //  Reset();

                }
                //StatDice.setText("" + Score);
                if(Score == 0){
                    StatDice.setImageResource(R.drawable.zero);
                    STBAR.setImageResource(R.drawable.dicezero);
                }else if(Score == 1){
                    StatDice.setImageResource(R.drawable.one);
                    STBAR.setImageResource(R.drawable.diceone);
                }else if(Score == 2){
                    StatDice.setImageResource(R.drawable.two);
                    STBAR.setImageResource(R.drawable.dicetwo);
                }else if(Score == 3){
                    StatDice.setImageResource(R.drawable.three);
                    STBAR.setImageResource(R.drawable.dicethree);
                }else if(Score == 4){
                    StatDice.setImageResource(R.drawable.four);
                    STBAR.setImageResource(R.drawable.dicefour);
                }else if(Score == 5){
                    StatDice.setImageResource(R.drawable.five);
                    STBAR.setImageResource(R.drawable.dicefive);
                }else if(Score == 6){
                    StatDice.setImageResource(R.drawable.six);
                    STBAR.setImageResource(R.drawable.dicesix);
                }else if(Score == 7){
                    StatDice.setImageResource(R.drawable.seven);
                    STBAR.setImageResource(R.drawable.diceseven);
                }else if(Score == 8){
                    StatDice.setImageResource(R.drawable.eight);
                    STBAR.setImageResource(R.drawable.diceeight);
                }else if(Score == 9){
                    StatDice.setImageResource(R.drawable.ninr);
                    STBAR.setImageResource(R.drawable.dicenine);
                }else if(Score == 10){
                    StatDice.setImageResource(R.drawable.ten);
                    STBAR.setImageResource(R.drawable.diceten);
                }else if(Score == 11){
                    StatDice.setImageResource(R.drawable.eleven);
                    STBAR.setImageResource(R.drawable.diceeleven);
                }else if(Score == 12){
                    StatDice.setImageResource(R.drawable.twele);
                    STBAR.setImageResource(R.drawable.dicetwele);
                }
                //StatDiceEm.setText("" + ScoreEm);
                if(ScoreEm == 0){
                    StatDiceEm.setImageResource(R.drawable.zero);
                    STEMBAR.setImageResource(R.drawable.dicezero);
                }else if(ScoreEm == 1){
                    StatDiceEm.setImageResource(R.drawable.one);
                    STEMBAR.setImageResource(R.drawable.diceone);
                }else if(ScoreEm == 2){
                    StatDiceEm.setImageResource(R.drawable.two);
                    STEMBAR.setImageResource(R.drawable.dicetwo);
                }else if(ScoreEm == 3){
                    StatDiceEm.setImageResource(R.drawable.three);
                    STEMBAR.setImageResource(R.drawable.dicethree);
                }else if(ScoreEm == 4){
                    StatDiceEm.setImageResource(R.drawable.four);
                    STEMBAR.setImageResource(R.drawable.dicefour);
                }else if(ScoreEm == 5){
                    StatDiceEm.setImageResource(R.drawable.five);
                    STEMBAR.setImageResource(R.drawable.dicefive);
                }else if(ScoreEm == 6){
                    StatDiceEm.setImageResource(R.drawable.six);
                    STEMBAR.setImageResource(R.drawable.dicesix);
                }else if(ScoreEm == 7){
                    StatDiceEm.setImageResource(R.drawable.seven);
                    STEMBAR.setImageResource(R.drawable.diceseven);
                }else if(ScoreEm == 8){
                    StatDiceEm.setImageResource(R.drawable.eight);
                    STEMBAR.setImageResource(R.drawable.diceeight);
                }else if(ScoreEm == 9){
                    StatDiceEm.setImageResource(R.drawable.ninr);
                    STEMBAR.setImageResource(R.drawable.dicenine);
                }else if(ScoreEm == 10){
                    StatDiceEm.setImageResource(R.drawable.ten);
                    STEMBAR.setImageResource(R.drawable.diceten);
                }else if(ScoreEm == 11){
                    StatDiceEm.setImageResource(R.drawable.eleven);
                    STEMBAR.setImageResource(R.drawable.diceeleven);
                }else if(ScoreEm == 12){
                    StatDiceEm.setImageResource(R.drawable.twele);
                    STEMBAR.setImageResource(R.drawable.dicetwele);
                }

                if(UserLP <= 0 ){
                    Score = 0 ;
                    ScoreEm = 0 ;
                    EmLP = 20 ;
                    UserLP = 20 ;
                    ///////////////////////////////////////////////////////////
                    enemyLP.setImageResource(R.drawable.twentyhpe);

                    userLP.setImageResource(R.drawable.twentyhpe);
                    ///////////////////////////////////////////////////////////
                    //////////////////////////////////////
                    STdice.setImageResource(R.drawable.scorezero);
                    STemdice.setImageResource(R.drawable.scorezero);
                    //WinorLose.setText("You Lose.");
                    WinorLose.setImageResource(R.drawable.space);
                    AlertDialog.Builder builder = new AlertDialog.Builder(Easy.this);
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            alertTextView.setVisibility(View.VISIBLE);
                        }
                    });
                    builder.setCancelable(true);
                    builder.setTitle("Annoucement");
                    builder.setMessage("You Lose.");

                    builder.show();
                }else if(EmLP <= 0){
                    Score = 0 ;
                    ScoreEm = 0 ;
                    EmLP = 20 ;
                    UserLP = 20 ;
                    ///////////////////////////////////////////////////////////
                    enemyLP.setImageResource(R.drawable.twentyhpe);

                    userLP.setImageResource(R.drawable.twentyhpe);
                    ///////////////////////////////////////////////////////////
                    //////////////////////////////////////
                    STdice.setImageResource(R.drawable.scorezero);
                    STemdice.setImageResource(R.drawable.scorezero);
                    STemdice.setImageResource(R.drawable.scorezero);
                    //WinorLose.setText("You Win.");
                    WinorLose.setImageResource(R.drawable.space);
                    AlertDialog.Builder builder = new AlertDialog.Builder(Easy.this);
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            alertTextView.setVisibility(View.VISIBLE);
                        }
                    });
                    builder.setCancelable(true);
                    builder.setTitle("Annoucement");
                    builder.setMessage("You Win.");

                    builder.show();
                }


            }


        });

        ATKbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int zero = 0 ;
                Random random = new Random();
                int check = 0 ;
                int minus = 0 ;

                ModeUser.setImageResource(R.drawable.atk);




                if(ScoreEm < 9 && Score != ScoreEm){
                    do{
                        check =  random.nextInt(6) ;
                        ScoreEm += check ;
                    }while (ScoreEm < 9) ; //random again till ScoreEM > 9

                    //StatDiceEm.setText("" + ScoreEm);
                    if(Score == 0){
                        StatDice.setImageResource(R.drawable.zero);
                        STBAR.setImageResource(R.drawable.dicezero);
                    }else if(Score == 1){
                        StatDice.setImageResource(R.drawable.one);
                        STBAR.setImageResource(R.drawable.diceone);
                    }else if(Score == 2){
                        StatDice.setImageResource(R.drawable.two);
                        STBAR.setImageResource(R.drawable.dicetwo);
                    }else if(Score == 3){
                        StatDice.setImageResource(R.drawable.three);
                        STBAR.setImageResource(R.drawable.dicethree);
                    }else if(Score == 4){
                        StatDice.setImageResource(R.drawable.four);
                        STBAR.setImageResource(R.drawable.dicefour);
                    }else if(Score == 5){
                        StatDice.setImageResource(R.drawable.five);
                        STBAR.setImageResource(R.drawable.dicefive);
                    }else if(Score == 6){
                        StatDice.setImageResource(R.drawable.six);
                        STBAR.setImageResource(R.drawable.dicesix);
                    }else if(Score == 7){
                        StatDice.setImageResource(R.drawable.seven);
                        STBAR.setImageResource(R.drawable.diceseven);
                    }else if(Score == 8){
                        StatDice.setImageResource(R.drawable.eight);
                        STBAR.setImageResource(R.drawable.diceeight);
                    }else if(Score == 9){
                        StatDice.setImageResource(R.drawable.ninr);
                        STBAR.setImageResource(R.drawable.dicenine);
                    }else if(Score == 10){
                        StatDice.setImageResource(R.drawable.ten);
                        STBAR.setImageResource(R.drawable.diceten);
                    }else if(Score == 11){
                        StatDice.setImageResource(R.drawable.eleven);
                        STBAR.setImageResource(R.drawable.diceeleven);
                    }else if(Score == 12){
                        StatDice.setImageResource(R.drawable.twele);
                        STBAR.setImageResource(R.drawable.dicetwele);
                    }
                }

                if(ScoreEm > 12){

                    minus = (Score - ScoreEm) - EmAmmor;
                    EmLP -= minus ;
                    Score = 0 ;
                    ScoreEm = 0 ;
                    //////////////////////////////////////
                    STdice.setImageResource(R.drawable.scorezero);
                    STemdice.setImageResource(R.drawable.scorezero);
                    ///////////////////////////////////////////////////////////

                    if(EmLP == 20){
                        enemyLP.setImageResource(R.drawable.twentyhpe);
                    }
                    else if(EmLP == 19){
                        enemyLP.setImageResource(R.drawable.nineteenhpe);
                    }
                    else if(EmLP == 18){
                        enemyLP.setImageResource(R.drawable.eightteenhpe);
                    }
                    else if(EmLP == 17){
                        enemyLP.setImageResource(R.drawable.seventeenhpe);
                    }
                    else if(EmLP == 16){
                        enemyLP.setImageResource(R.drawable.sixteenhpe);
                    }
                    else if(EmLP == 15){
                        enemyLP.setImageResource(R.drawable.fifteenhpe);
                    }
                    else if(EmLP == 14){
                        enemyLP.setImageResource(R.drawable.fourteenhpe);
                    }
                    else if(EmLP == 13){
                        enemyLP.setImageResource(R.drawable.thirteenhpe);
                    }
                    else if(EmLP == 12){
                        enemyLP.setImageResource(R.drawable.twelehpe);
                    }
                    else if(EmLP == 11){
                        enemyLP.setImageResource(R.drawable.elevenhpe);
                    }
                    else if(EmLP == 10){
                        enemyLP.setImageResource(R.drawable.tenhpe);
                    }
                    else if(EmLP == 9){
                        enemyLP.setImageResource(R.drawable.ninehpe);
                    }
                    else if(EmLP == 8){
                        enemyLP.setImageResource(R.drawable.eighthpe);
                    }
                    else if(EmLP == 7){
                        enemyLP.setImageResource(R.drawable.sevenhpe);
                    }
                    else if(EmLP == 6){
                        enemyLP.setImageResource(R.drawable.sixhpe);
                    }
                    else if(EmLP == 5){
                        enemyLP.setImageResource(R.drawable.fivehpe);
                    }
                    else if(EmLP == 4){
                        enemyLP.setImageResource(R.drawable.fourhpe);
                    }
                    else if(EmLP == 3){
                        enemyLP.setImageResource(R.drawable.threehpe);
                    }
                    else if(EmLP == 2){
                        enemyLP.setImageResource(R.drawable.twohpe);
                    }
                    else if(EmLP == 1){
                        enemyLP.setImageResource(R.drawable.onehpe);
                    }


                    //////////////////////////////////////////////////////////
                    if(minus == 0){
                        WinorLose.setImageResource(R.drawable.azero);
                    }else if(minus == 1){
                        WinorLose.setImageResource(R.drawable.aone);
                    }else if(minus == 2) {
                        WinorLose.setImageResource(R.drawable.atwo);
                    }else if(minus == 3){
                        WinorLose.setImageResource(R.drawable.athree);
                    }else if(minus == 4){
                        WinorLose.setImageResource(R.drawable.afour);
                    }else if(minus == 5){
                        WinorLose.setImageResource(R.drawable.afive);
                    }else if(minus == 6){
                        WinorLose.setImageResource(R.drawable.asix);
                    }else if(minus == 7){
                        WinorLose.setImageResource(R.drawable.aseven);
                    }else if(minus == 8){
                        WinorLose.setImageResource(R.drawable.aeight);
                    }else if(minus == 9){
                        WinorLose.setImageResource(R.drawable.anine);
                    }else if(minus == 10){
                        WinorLose.setImageResource(R.drawable.aten);
                    }else if(minus == 11){
                        WinorLose.setImageResource(R.drawable.aeleven);
                    }else if(minus == 12){
                        WinorLose.setImageResource(R.drawable.atwele);
                    }
                    //WinorLose.setText("attack " + minus);
                    ModeEm.setImageResource(R.drawable.def);
                }



                ///////////////////////////////////
                ///////////////////////////////////


                ///////////////////////////////////
                ///////////////////////////////////


                if(Score > ScoreEm){

                    minus = Score - EmAmmor;
                    EmLP -= minus ;
                    Score = 0 ;
                    ScoreEm = 0 ;
                    //////////////////////////////////////
                    STdice.setImageResource(R.drawable.scorezero);
                    STemdice.setImageResource(R.drawable.scorezero);
                    ///////////////////////////////////////////////////////////

                    if(EmLP == 20){
                        enemyLP.setImageResource(R.drawable.twentyhpe);
                    }
                    else if(EmLP == 19){
                        enemyLP.setImageResource(R.drawable.nineteenhpe);
                    }
                    else if(EmLP == 18){
                        enemyLP.setImageResource(R.drawable.eightteenhpe);
                    }
                    else if(EmLP == 17){
                        enemyLP.setImageResource(R.drawable.seventeenhpe);
                    }
                    else if(EmLP == 16){
                        enemyLP.setImageResource(R.drawable.sixteenhpe);
                    }
                    else if(EmLP == 15){
                        enemyLP.setImageResource(R.drawable.fifteenhpe);
                    }
                    else if(EmLP == 14){
                        enemyLP.setImageResource(R.drawable.fourteenhpe);
                    }
                    else if(EmLP == 13){
                        enemyLP.setImageResource(R.drawable.thirteenhpe);
                    }
                    else if(EmLP == 12){
                        enemyLP.setImageResource(R.drawable.twelehpe);
                    }
                    else if(EmLP == 11){
                        enemyLP.setImageResource(R.drawable.elevenhpe);
                    }
                    else if(EmLP == 10){
                        enemyLP.setImageResource(R.drawable.tenhpe);
                    }
                    else if(EmLP == 9){
                        enemyLP.setImageResource(R.drawable.ninehpe);
                    }
                    else if(EmLP == 8){
                        enemyLP.setImageResource(R.drawable.eighthpe);
                    }
                    else if(EmLP == 7){
                        enemyLP.setImageResource(R.drawable.sevenhpe);
                    }
                    else if(EmLP == 6){
                        enemyLP.setImageResource(R.drawable.sixhpe);
                    }
                    else if(EmLP == 5){
                        enemyLP.setImageResource(R.drawable.fivehpe);
                    }
                    else if(EmLP == 4){
                        enemyLP.setImageResource(R.drawable.fourhpe);
                    }
                    else if(EmLP == 3){
                        enemyLP.setImageResource(R.drawable.threehpe);
                    }
                    else if(EmLP == 2){
                        enemyLP.setImageResource(R.drawable.twohpe);
                    }
                    else if(EmLP == 1){
                        enemyLP.setImageResource(R.drawable.onehpe);
                    }

                    //////////////////////////////////////////////////////////
                    if(minus == 0){
                        WinorLose.setImageResource(R.drawable.azero);
                    }else if(minus == 1){
                        WinorLose.setImageResource(R.drawable.aone);
                    }else if(minus == 2) {
                        WinorLose.setImageResource(R.drawable.atwo);
                    }else if(minus == 3){
                        WinorLose.setImageResource(R.drawable.athree);
                    }else if(minus == 4){
                        WinorLose.setImageResource(R.drawable.afour);
                    }else if(minus == 5){
                        WinorLose.setImageResource(R.drawable.afive);
                    }else if(minus == 6){
                        WinorLose.setImageResource(R.drawable.asix);
                    }else if(minus == 7){
                        WinorLose.setImageResource(R.drawable.aseven);
                    }else if(minus == 8){
                        WinorLose.setImageResource(R.drawable.aeight);
                    }else if(minus == 9){
                        WinorLose.setImageResource(R.drawable.anine);
                    }else if(minus == 10){
                        WinorLose.setImageResource(R.drawable.aten);
                    }else if(minus == 11){
                        WinorLose.setImageResource(R.drawable.aeleven);
                    }else if(minus == 12){
                        WinorLose.setImageResource(R.drawable.atwele);
                    }
                    //WinorLose.setText("attack " + minus);
                    ModeEm.setImageResource(R.drawable.atk);

                }else if(Score < ScoreEm ){
                    minus = ScoreEm ; // BOT Attack mode
                    UserLP -= minus ;
                    Score = 0 ;
                    ScoreEm = 0 ;
                    //////////////////////////////////////
                    STdice.setImageResource(R.drawable.scorezero);
                    STemdice.setImageResource(R.drawable.scorezero);
                    ////////////////////////////////////////////////////////////////

                    if(UserLP == 20){
                        userLP.setImageResource(R.drawable.twentyhpe);
                    }
                    else if(UserLP == 19){
                        userLP.setImageResource(R.drawable.nineteenhpe);
                    }
                    else if(UserLP == 18){
                        userLP.setImageResource(R.drawable.eightteenhpe);
                    }
                    else if(UserLP == 17){
                        userLP.setImageResource(R.drawable.seventeenhpe);
                    }
                    else if(UserLP == 16){
                        userLP.setImageResource(R.drawable.sixteenhpe);
                    }
                    else if(UserLP == 15){
                        userLP.setImageResource(R.drawable.fifteenhpe);
                    }
                    else if(UserLP == 14){
                        userLP.setImageResource(R.drawable.fourteenhpe);
                    }
                    else if(UserLP == 13){
                        userLP.setImageResource(R.drawable.thirteenhpe);
                    }
                    else if(UserLP == 12){
                        userLP.setImageResource(R.drawable.twelehpe);
                    }
                    else if(UserLP == 11){
                        userLP.setImageResource(R.drawable.elevenhpe);
                    }
                    else if(UserLP == 10){
                        userLP.setImageResource(R.drawable.tenhpe);
                    }
                    else if(UserLP == 9){
                        userLP.setImageResource(R.drawable.ninehpe);
                    }
                    else if(UserLP == 8){
                        userLP.setImageResource(R.drawable.eighthpe);
                    }
                    else if(UserLP == 7){
                        userLP.setImageResource(R.drawable.sevenhpe);
                    }
                    else if(UserLP == 6){
                        userLP.setImageResource(R.drawable.sixhpe);
                    }
                    else if(UserLP == 5){
                        userLP.setImageResource(R.drawable.fivehpe);
                    }
                    else if(UserLP == 4){
                        userLP.setImageResource(R.drawable.fourhpe);
                    }
                    else if(UserLP == 3){
                        userLP.setImageResource(R.drawable.threehpe);
                    }
                    else if(UserLP == 2){
                        userLP.setImageResource(R.drawable.twohpe);
                    }
                    else if(UserLP == 1){
                        userLP.setImageResource(R.drawable.onehpe);
                    }

                    ////////////////////////////////////////////////////////////////
                    if(minus  == 0){
                        WinorLose.setImageResource(R.drawable.rdzero);
                    }else if(minus  == 1){
                        WinorLose.setImageResource(R.drawable.rdone);
                    }else if(minus  == 2) {
                        WinorLose.setImageResource(R.drawable.rdtwo);
                    }else if(minus == 3){
                        WinorLose.setImageResource(R.drawable.rdthree);
                    }else if(minus  == 4){
                        WinorLose.setImageResource(R.drawable.rdfour);
                    }else if(minus  == 5){
                        WinorLose.setImageResource(R.drawable.rdfive);
                    }else if(minus  == 6){
                        WinorLose.setImageResource(R.drawable.rdsix);
                    }else if(minus  == 7){
                        WinorLose.setImageResource(R.drawable.rdseven);
                    }else if(minus  == 8){
                        WinorLose.setImageResource(R.drawable.rdeight);
                    }else if(minus  == 9){
                        WinorLose.setImageResource(R.drawable.rdnine);
                    }else if(minus  == 10){
                        WinorLose.setImageResource(R.drawable.rdten);
                    }else if(minus  == 11){
                        WinorLose.setImageResource(R.drawable.rdeleven);
                    }else if(minus  == 12){
                        WinorLose.setImageResource(R.drawable.rdtwele);
                    }
                    //WinorLose.setText("taked damage " + minus);
                    //delay 2 second

                    //   WinorLose.setText("Win or Lose");
                    // Reset();
                }else if(Score == ScoreEm ){

                    Score = 0 ;
                    ScoreEm = 0 ;
                    //////////////////////////////////////
                    STdice.setImageResource(R.drawable.scorezero);
                    STemdice.setImageResource(R.drawable.scorezero);
                    WinorLose.setImageResource(R.drawable.draw);
                    //WinorLose.setText("Draw!!");
                    //delay 2 second

                    // WinorLose.setText("Win or Lose");
                    //Reset();
                }
                Score = 0 ;
                ScoreEm = 0 ;
                //StatDice.setText("" + Score);
                if(Score == 0){
                    StatDice.setImageResource(R.drawable.zero);
                    STBAR.setImageResource(R.drawable.dicezero);
                }else if(Score == 1){
                    StatDice.setImageResource(R.drawable.one);
                    STBAR.setImageResource(R.drawable.diceone);
                }else if(Score == 2){
                    StatDice.setImageResource(R.drawable.two);
                    STBAR.setImageResource(R.drawable.dicetwo);
                }else if(Score == 3){
                    StatDice.setImageResource(R.drawable.three);
                    STBAR.setImageResource(R.drawable.dicethree);
                }else if(Score == 4){
                    StatDice.setImageResource(R.drawable.four);
                    STBAR.setImageResource(R.drawable.dicefour);
                }else if(Score == 5){
                    StatDice.setImageResource(R.drawable.five);
                    STBAR.setImageResource(R.drawable.dicefive);
                }else if(Score == 6){
                    StatDice.setImageResource(R.drawable.six);
                    STBAR.setImageResource(R.drawable.dicesix);
                }else if(Score == 7){
                    StatDice.setImageResource(R.drawable.seven);
                    STBAR.setImageResource(R.drawable.diceseven);
                }else if(Score == 8){
                    StatDice.setImageResource(R.drawable.eight);
                    STBAR.setImageResource(R.drawable.diceeight);
                }else if(Score == 9){
                    StatDice.setImageResource(R.drawable.ninr);
                    STBAR.setImageResource(R.drawable.dicenine);
                }else if(Score == 10){
                    StatDice.setImageResource(R.drawable.ten);
                    STBAR.setImageResource(R.drawable.diceten);
                }else if(Score == 11){
                    StatDice.setImageResource(R.drawable.eleven);
                    STBAR.setImageResource(R.drawable.diceeleven);
                }else if(Score == 12){
                    StatDice.setImageResource(R.drawable.twele);
                    STBAR.setImageResource(R.drawable.dicetwele);
                }
                //StatDiceEm.setText("" + ScoreEm);
                if(ScoreEm == 0){
                    StatDiceEm.setImageResource(R.drawable.zero);
                    STEMBAR.setImageResource(R.drawable.dicezero);
                }else if(ScoreEm == 1){
                    StatDiceEm.setImageResource(R.drawable.one);
                    STEMBAR.setImageResource(R.drawable.diceone);
                }else if(ScoreEm == 2){
                    StatDiceEm.setImageResource(R.drawable.two);
                    STEMBAR.setImageResource(R.drawable.dicetwo);
                }else if(ScoreEm == 3){
                    StatDiceEm.setImageResource(R.drawable.three);
                    STEMBAR.setImageResource(R.drawable.dicethree);
                }else if(ScoreEm == 4){
                    StatDiceEm.setImageResource(R.drawable.four);
                    STEMBAR.setImageResource(R.drawable.dicefour);
                }else if(ScoreEm == 5){
                    StatDiceEm.setImageResource(R.drawable.five);
                    STEMBAR.setImageResource(R.drawable.dicefive);
                }else if(ScoreEm == 6){
                    StatDiceEm.setImageResource(R.drawable.six);
                    STEMBAR.setImageResource(R.drawable.dicesix);
                }else if(ScoreEm == 7){
                    StatDiceEm.setImageResource(R.drawable.seven);
                    STEMBAR.setImageResource(R.drawable.diceseven);
                }else if(ScoreEm == 8){
                    StatDiceEm.setImageResource(R.drawable.eight);
                    STEMBAR.setImageResource(R.drawable.diceeight);
                }else if(ScoreEm == 9){
                    StatDiceEm.setImageResource(R.drawable.ninr);
                    STEMBAR.setImageResource(R.drawable.dicenine);
                }else if(ScoreEm == 10){
                    StatDiceEm.setImageResource(R.drawable.ten);
                    STEMBAR.setImageResource(R.drawable.diceten);
                }else if(ScoreEm == 11){
                    StatDiceEm.setImageResource(R.drawable.eleven);
                    STEMBAR.setImageResource(R.drawable.diceeleven);
                }else if(ScoreEm == 12){
                    StatDiceEm.setImageResource(R.drawable.twele);
                    STEMBAR.setImageResource(R.drawable.dicetwele);
                }

                if(UserLP <= 0 ){
                    Score = 0 ;
                    ScoreEm = 0 ;
                    EmLP = 20 ;
                    UserLP = 20 ;
                    ///////////////////////////////////////////////////////////
                    enemyLP.setImageResource(R.drawable.twentyhpe);

                    userLP.setImageResource(R.drawable.twentyhpe);
                    ///////////////////////////////////////////////////////////
                    //////////////////////////////////////
                    STdice.setImageResource(R.drawable.scorezero);
                    STemdice.setImageResource(R.drawable.scorezero);
                    WinorLose.setImageResource(R.drawable.space);
                    AlertDialog.Builder builder = new AlertDialog.Builder(Easy.this);
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            alertTextView.setVisibility(View.VISIBLE);
                        }
                    });
                    builder.setCancelable(true);
                    builder.setTitle("Annoucement");
                    builder.setMessage("You Lose.");

                    builder.show();
                }else if(EmLP <= 0){
                    Score = 0 ;
                    ScoreEm = 0 ;
                    EmLP = 20 ;
                    UserLP = 20 ;
                    ///////////////////////////////////////////////////////////
                    enemyLP.setImageResource(R.drawable.twentyhpe);

                    userLP.setImageResource(R.drawable.twentyhpe);
                    ///////////////////////////////////////////////////////////
                    //////////////////////////////////////
                    STdice.setImageResource(R.drawable.scorezero);
                    STemdice.setImageResource(R.drawable.scorezero);
                    STemdice.setImageResource(R.drawable.scorezero);
                    //WinorLose.setText("You Win.");
                    WinorLose.setImageResource(R.drawable.space);
                    AlertDialog.Builder builder = new AlertDialog.Builder(Easy.this);
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            alertTextView.setVisibility(View.VISIBLE);
                        }
                    });
                    builder.setCancelable(true);
                    builder.setTitle("Annoucement");
                    builder.setMessage("You Win.");

                    builder.show();
                }
            }

        });

        DEFbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int zero = 0 ;
                Random random = new Random();
                int check = 0 ;
                int minus = 0 ;

                ModeUser.setImageResource(R.drawable.def);


                if(Score > ScoreEm){
                    if(ScoreEm > 9){
                        do{
                            check =  random.nextInt(6) ;
                            ScoreEm += check ;
                        }while (ScoreEm < 9) ; //random again till ScoreEM > 9
                    }

                    if(Score > ScoreEm){
                        minus = 0;
                        EmLP += minus ;
                        Score = 0 ;
                        ScoreEm = 0 ;
                        //////////////////////////////////////
                        STdice.setImageResource(R.drawable.scorezero);
                        STemdice.setImageResource(R.drawable.scorezero);
                        ///////////////////////////////////////////////////////////

                        if(EmLP == 20){
                            enemyLP.setImageResource(R.drawable.twentyhpe);
                        }
                        else if(EmLP == 19){
                            enemyLP.setImageResource(R.drawable.nineteenhpe);
                        }
                        else if(EmLP == 18){
                            enemyLP.setImageResource(R.drawable.eightteenhpe);
                        }
                        else if(EmLP == 17){
                            enemyLP.setImageResource(R.drawable.seventeenhpe);
                        }
                        else if(EmLP == 16){
                            enemyLP.setImageResource(R.drawable.sixteenhpe);
                        }
                        else if(EmLP == 15){
                            enemyLP.setImageResource(R.drawable.fifteenhpe);
                        }
                        else if(EmLP == 14){
                            enemyLP.setImageResource(R.drawable.fourteenhpe);
                        }
                        else if(EmLP == 13){
                            enemyLP.setImageResource(R.drawable.thirteenhpe);
                        }
                        else if(EmLP == 12){
                            enemyLP.setImageResource(R.drawable.twelehpe);
                        }
                        else if(EmLP == 11){
                            enemyLP.setImageResource(R.drawable.elevenhpe);
                        }
                        else if(EmLP == 10){
                            enemyLP.setImageResource(R.drawable.tenhpe);
                        }
                        else if(EmLP == 9){
                            enemyLP.setImageResource(R.drawable.ninehpe);
                        }
                        else if(EmLP == 8){
                            enemyLP.setImageResource(R.drawable.eighthpe);
                        }
                        else if(EmLP == 7){
                            enemyLP.setImageResource(R.drawable.sevenhpe);
                        }
                        else if(EmLP == 6){
                            enemyLP.setImageResource(R.drawable.sixhpe);
                        }
                        else if(EmLP == 5){
                            enemyLP.setImageResource(R.drawable.fivehpe);
                        }
                        else if(EmLP == 4){
                            enemyLP.setImageResource(R.drawable.fourhpe);
                        }
                        else if(EmLP == 3){
                            enemyLP.setImageResource(R.drawable.threehpe);
                        }
                        else if(EmLP == 2){
                            enemyLP.setImageResource(R.drawable.twohpe);
                        }
                        else if(EmLP == 1){
                            enemyLP.setImageResource(R.drawable.onehpe);
                        }


                        //////////////////////////////////////////////////////////
                        if((minus * -1 ) == 0){
                            WinorLose.setImageResource(R.drawable.rdzero);
                        }else if((minus * -1 ) == 1){
                            WinorLose.setImageResource(R.drawable.rdone);
                        }else if((minus * -1 ) == 2) {
                            WinorLose.setImageResource(R.drawable.rdtwo);
                        }else if((minus * -1 ) == 3){
                            WinorLose.setImageResource(R.drawable.rdthree);
                        }else if((minus * -1 ) == 4){
                            WinorLose.setImageResource(R.drawable.rdfour);
                        }else if((minus * -1 ) == 5){
                            WinorLose.setImageResource(R.drawable.rdfive);
                        }else if((minus * -1 ) == 6){
                            WinorLose.setImageResource(R.drawable.rdsix);
                        }else if((minus * -1 ) == 7){
                            WinorLose.setImageResource(R.drawable.rdseven);
                        }else if((minus * -1 ) == 8){
                            WinorLose.setImageResource(R.drawable.rdeight);
                        }else if((minus * -1 ) == 9){
                            WinorLose.setImageResource(R.drawable.rdnine);
                        }else if((minus * -1 ) == 10){
                            WinorLose.setImageResource(R.drawable.rdten);
                        }else if((minus * -1 ) == 11){
                            WinorLose.setImageResource(R.drawable.rdeleven);
                        }else if((minus * -1 ) == 12){
                            WinorLose.setImageResource(R.drawable.rdtwele);
                        }
                        //WinorLose.setText("attack " + (minus*-1));
                    }else{
                        minus = Score - ScoreEm ;
                        UserLP += minus ;
                        Score = 0 ;
                        ScoreEm = 0 ;
                        //////////////////////////////////////
                        STdice.setImageResource(R.drawable.scorezero);
                        STemdice.setImageResource(R.drawable.scorezero);
                        //////////////////////////////////////////////////////////

                        if(UserLP == 20){
                            userLP.setImageResource(R.drawable.twentyhpe);
                        }
                        else if(UserLP == 19){
                            userLP.setImageResource(R.drawable.nineteenhpe);
                        }
                        else if(UserLP == 18){
                            userLP.setImageResource(R.drawable.eightteenhpe);
                        }
                        else if(UserLP == 17){
                            userLP.setImageResource(R.drawable.seventeenhpe);
                        }
                        else if(UserLP == 16){
                            userLP.setImageResource(R.drawable.sixteenhpe);
                        }
                        else if(UserLP == 15){
                            userLP.setImageResource(R.drawable.fifteenhpe);
                        }
                        else if(UserLP == 14){
                            userLP.setImageResource(R.drawable.fourteenhpe);
                        }
                        else if(UserLP == 13){
                            userLP.setImageResource(R.drawable.thirteenhpe);
                        }
                        else if(UserLP == 12){
                            userLP.setImageResource(R.drawable.twelehpe);
                        }
                        else if(UserLP == 11){
                            userLP.setImageResource(R.drawable.elevenhpe);
                        }
                        else if(UserLP == 10){
                            userLP.setImageResource(R.drawable.tenhpe);
                        }
                        else if(UserLP == 9){
                            userLP.setImageResource(R.drawable.ninehpe);
                        }
                        else if(UserLP == 8){
                            userLP.setImageResource(R.drawable.eighthpe);
                        }
                        else if(UserLP == 7){
                            userLP.setImageResource(R.drawable.sevenhpe);
                        }
                        else if(UserLP == 6){
                            userLP.setImageResource(R.drawable.sixhpe);
                        }
                        else if(UserLP == 5){
                            userLP.setImageResource(R.drawable.fivehpe);
                        }
                        else if(UserLP == 4){
                            userLP.setImageResource(R.drawable.fourhpe);
                        }
                        else if(UserLP == 3){
                            userLP.setImageResource(R.drawable.threehpe);
                        }
                        else if(UserLP == 2){
                            userLP.setImageResource(R.drawable.twohpe);
                        }
                        else if(UserLP == 1){
                            userLP.setImageResource(R.drawable.onehpe);
                        }

                        /////////////////////////////////////////////////////////
                        if((minus * -1 ) == 0){
                            WinorLose.setImageResource(R.drawable.rdzero);
                        }else if((minus * -1 ) == 1){
                            WinorLose.setImageResource(R.drawable.rdone);
                        }else if((minus * -1 ) == 2) {
                            WinorLose.setImageResource(R.drawable.rdtwo);
                        }else if((minus * -1 ) == 3){
                            WinorLose.setImageResource(R.drawable.rdthree);
                        }else if((minus * -1 ) == 4){
                            WinorLose.setImageResource(R.drawable.rdfour);
                        }else if((minus * -1 ) == 5){
                            WinorLose.setImageResource(R.drawable.rdfive);
                        }else if((minus * -1 ) == 6){
                            WinorLose.setImageResource(R.drawable.rdsix);
                        }else if((minus * -1 ) == 7){
                            WinorLose.setImageResource(R.drawable.rdseven);
                        }else if((minus * -1 ) == 8){
                            WinorLose.setImageResource(R.drawable.rdeight);
                        }else if((minus * -1 ) == 9){
                            WinorLose.setImageResource(R.drawable.rdnine);
                        }else if((minus * -1 ) == 10){
                            WinorLose.setImageResource(R.drawable.rdten);
                        }else if((minus * -1 ) == 11){
                            WinorLose.setImageResource(R.drawable.rdeleven);
                        }else if((minus * -1 ) == 12){
                            WinorLose.setImageResource(R.drawable.rdtwele);
                        }
                        //WinorLose.setText("taked damage " + (minus*-1));
                    }

                    //delay 2 second

                    //   WinorLose.setText("Win or Lose");
                    //Reset();
                }else if(Score < ScoreEm ){
                    minus = Score - ScoreEm ;
                    UserLP += minus ;
                    Score = 0 ;
                    ScoreEm = 0 ;
                    //////////////////////////////////////
                    STdice.setImageResource(R.drawable.scorezero);
                    STemdice.setImageResource(R.drawable.scorezero);
                    //////////////////////////////////////////////////////////

                    if(UserLP == 20){
                        userLP.setImageResource(R.drawable.twentyhpe);
                    }
                    else if(UserLP == 19){
                        userLP.setImageResource(R.drawable.nineteenhpe);
                    }
                    else if(UserLP == 18){
                        userLP.setImageResource(R.drawable.eightteenhpe);
                    }
                    else if(UserLP == 17){
                        userLP.setImageResource(R.drawable.seventeenhpe);
                    }
                    else if(UserLP == 16){
                        userLP.setImageResource(R.drawable.sixteenhpe);
                    }
                    else if(UserLP == 15){
                        userLP.setImageResource(R.drawable.fifteenhpe);
                    }
                    else if(UserLP == 14){
                        userLP.setImageResource(R.drawable.fourteenhpe);
                    }
                    else if(UserLP == 13){
                        userLP.setImageResource(R.drawable.thirteenhpe);
                    }
                    else if(UserLP == 12){
                        userLP.setImageResource(R.drawable.twelehpe);
                    }
                    else if(UserLP == 11){
                        userLP.setImageResource(R.drawable.elevenhpe);
                    }
                    else if(UserLP == 10){
                        userLP.setImageResource(R.drawable.tenhpe);
                    }
                    else if(UserLP == 9){
                        userLP.setImageResource(R.drawable.ninehpe);
                    }
                    else if(UserLP == 8){
                        userLP.setImageResource(R.drawable.eighthpe);
                    }
                    else if(UserLP == 7){
                        userLP.setImageResource(R.drawable.sevenhpe);
                    }
                    else if(UserLP == 6){
                        userLP.setImageResource(R.drawable.sixhpe);
                    }
                    else if(UserLP == 5){
                        userLP.setImageResource(R.drawable.fivehpe);
                    }
                    else if(UserLP == 4){
                        userLP.setImageResource(R.drawable.fourhpe);
                    }
                    else if(UserLP == 3){
                        userLP.setImageResource(R.drawable.threehpe);
                    }
                    else if(UserLP == 2){
                        userLP.setImageResource(R.drawable.twohpe);
                    }
                    else if(UserLP == 1){
                        userLP.setImageResource(R.drawable.onehpe);
                    }

                    /////////////////////////////////////////////////////////
                    if((minus * -1 ) == 0){
                        WinorLose.setImageResource(R.drawable.rdzero);
                    }else if((minus * -1 ) == 1){
                        WinorLose.setImageResource(R.drawable.rdone);
                    }else if((minus * -1 ) == 2) {
                        WinorLose.setImageResource(R.drawable.rdtwo);
                    }else if((minus * -1 ) == 3){
                        WinorLose.setImageResource(R.drawable.rdthree);
                    }else if((minus * -1 ) == 4){
                        WinorLose.setImageResource(R.drawable.rdfour);
                    }else if((minus * -1 ) == 5){
                        WinorLose.setImageResource(R.drawable.rdfive);
                    }else if((minus * -1 ) == 6){
                        WinorLose.setImageResource(R.drawable.rdsix);
                    }else if((minus * -1 ) == 7){
                        WinorLose.setImageResource(R.drawable.rdseven);
                    }else if((minus * -1 ) == 8){
                        WinorLose.setImageResource(R.drawable.rdeight);
                    }else if((minus * -1 ) == 9){
                        WinorLose.setImageResource(R.drawable.rdnine);
                    }else if((minus * -1 ) == 10){
                        WinorLose.setImageResource(R.drawable.rdten);
                    }else if((minus * -1 ) == 11){
                        WinorLose.setImageResource(R.drawable.rdeleven);
                    }else if((minus * -1 ) == 12){
                        WinorLose.setImageResource(R.drawable.rdtwele);
                    }
                    //WinorLose.setText("taked damage " + (minus*-1));
                    //delay 2 second

                    //   WinorLose.setText("Win or Lose");
                    // Reset();
                }else if(Score == ScoreEm ){
                    Score = 0 ;
                    ScoreEm = 0 ;
                    //////////////////////////////////////
                    STdice.setImageResource(R.drawable.scorezero);
                    STemdice.setImageResource(R.drawable.scorezero);
                    WinorLose.setImageResource(R.drawable.draw);
                    //WinorLose.setText("Draw!!");
                    //delay 2 second

                    // WinorLose.setText("Win or Lose");
                    //Reset();
                }

                if(UserLP <= 0 ){
                    Score = 0 ;
                    ScoreEm = 0 ;
                    EmLP = 20 ;
                    UserLP = 20 ;
                    ///////////////////////////////////////////////////////////
                    enemyLP.setImageResource(R.drawable.twentyhpe);

                    userLP.setImageResource(R.drawable.twentyhpe);
                    ///////////////////////////////////////////////////////////
                    //////////////////////////////////////
                    STdice.setImageResource(R.drawable.scorezero);
                    STemdice.setImageResource(R.drawable.scorezero);
                    WinorLose.setImageResource(R.drawable.space);
                    AlertDialog.Builder builder = new AlertDialog.Builder(Easy.this);
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            alertTextView.setVisibility(View.VISIBLE);
                        }
                    });
                    builder.setCancelable(true);
                    builder.setTitle("Annoucement");
                    builder.setMessage("You Lose.");

                    builder.show();
                }else if(EmLP <= 0){
                    Score = 0 ;
                    ScoreEm = 0 ;
                    EmLP = 20 ;
                    UserLP = 20 ;
                    ///////////////////////////////////////////////////////////
                    enemyLP.setImageResource(R.drawable.twentyhpe);

                    userLP.setImageResource(R.drawable.twentyhpe);
                    ///////////////////////////////////////////////////////////
                    //////////////////////////////////////
                    STdice.setImageResource(R.drawable.scorezero);
                    STemdice.setImageResource(R.drawable.scorezero);
                    STemdice.setImageResource(R.drawable.scorezero);
                    //WinorLose.setText("You Win.");
                    WinorLose.setImageResource(R.drawable.space);
                    AlertDialog.Builder builder = new AlertDialog.Builder(Easy.this);
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            alertTextView.setVisibility(View.VISIBLE);
                        }
                    });
                    builder.setCancelable(true);
                    builder.setTitle("Annoucement");
                    builder.setMessage("You Win.");

                    builder.show();
                }

                Score = 0 ;
                ScoreEm = 0 ;
                //StatDice.setText("" + Score);
                if(Score == 0){
                    StatDice.setImageResource(R.drawable.zero);
                    STBAR.setImageResource(R.drawable.dicezero);
                }else if(Score == 1){
                    StatDice.setImageResource(R.drawable.one);
                    STBAR.setImageResource(R.drawable.diceone);
                }else if(Score == 2){
                    StatDice.setImageResource(R.drawable.two);
                    STBAR.setImageResource(R.drawable.dicetwo);
                }else if(Score == 3){
                    StatDice.setImageResource(R.drawable.three);
                    STBAR.setImageResource(R.drawable.dicethree);
                }else if(Score == 4){
                    StatDice.setImageResource(R.drawable.four);
                    STBAR.setImageResource(R.drawable.dicefour);
                }else if(Score == 5){
                    StatDice.setImageResource(R.drawable.five);
                    STBAR.setImageResource(R.drawable.dicefive);
                }else if(Score == 6){
                    StatDice.setImageResource(R.drawable.six);
                    STBAR.setImageResource(R.drawable.dicesix);
                }else if(Score == 7){
                    StatDice.setImageResource(R.drawable.seven);
                    STBAR.setImageResource(R.drawable.diceseven);
                }else if(Score == 8){
                    StatDice.setImageResource(R.drawable.eight);
                    STBAR.setImageResource(R.drawable.diceeight);
                }else if(Score == 9){
                    StatDice.setImageResource(R.drawable.ninr);
                    STBAR.setImageResource(R.drawable.dicenine);
                }else if(Score == 10){
                    StatDice.setImageResource(R.drawable.ten);
                    STBAR.setImageResource(R.drawable.diceten);
                }else if(Score == 11){
                    StatDice.setImageResource(R.drawable.eleven);
                    STBAR.setImageResource(R.drawable.diceeleven);
                }else if(Score == 12){
                    StatDice.setImageResource(R.drawable.twele);
                    STBAR.setImageResource(R.drawable.dicetwele);
                }
                //StatDiceEm.setText("" + ScoreEm);
                if(ScoreEm == 0){
                    StatDiceEm.setImageResource(R.drawable.zero);
                    STEMBAR.setImageResource(R.drawable.dicezero);
                }else if(ScoreEm == 1){
                    StatDiceEm.setImageResource(R.drawable.one);
                    STEMBAR.setImageResource(R.drawable.diceone);
                }else if(ScoreEm == 2){
                    StatDiceEm.setImageResource(R.drawable.two);
                    STEMBAR.setImageResource(R.drawable.dicetwo);
                }else if(ScoreEm == 3){
                    StatDiceEm.setImageResource(R.drawable.three);
                    STEMBAR.setImageResource(R.drawable.dicethree);
                }else if(ScoreEm == 4){
                    StatDiceEm.setImageResource(R.drawable.four);
                    STEMBAR.setImageResource(R.drawable.dicefour);
                }else if(ScoreEm == 5){
                    StatDiceEm.setImageResource(R.drawable.five);
                    STEMBAR.setImageResource(R.drawable.dicefive);
                }else if(ScoreEm == 6){
                    StatDiceEm.setImageResource(R.drawable.six);
                    STEMBAR.setImageResource(R.drawable.dicesix);
                }else if(ScoreEm == 7){
                    StatDiceEm.setImageResource(R.drawable.seven);
                    STEMBAR.setImageResource(R.drawable.diceseven);
                }else if(ScoreEm == 8){
                    StatDiceEm.setImageResource(R.drawable.eight);
                    STEMBAR.setImageResource(R.drawable.diceeight);
                }else if(ScoreEm == 9){
                    StatDiceEm.setImageResource(R.drawable.ninr);
                    STEMBAR.setImageResource(R.drawable.dicenine);
                }else if(ScoreEm == 10){
                    StatDiceEm.setImageResource(R.drawable.ten);
                    STEMBAR.setImageResource(R.drawable.diceten);
                }else if(ScoreEm == 11){
                    StatDiceEm.setImageResource(R.drawable.eleven);
                    STEMBAR.setImageResource(R.drawable.diceeleven);
                }else if(ScoreEm == 12){
                    StatDiceEm.setImageResource(R.drawable.twele);
                    STEMBAR.setImageResource(R.drawable.dicetwele);
                }
            }

        });

    }
}