package com.example.amhariccustomkeyboard;

import android.inputmethodservice.InputMethodService;
import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import android.media.AudioManager;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputConnection;


public class AmaharicKeyboard  extends InputMethodService implements KeyboardView.OnKeyboardActionListener {
    private static final String TAG = "AmaharicKeyboard";
    
    private KeyboardView keyboardView;
    private Keyboard keyboard;
    int key_family = 0;
    int first_time_selected = 0;
    boolean shift_selected = false;
    boolean number_selected = false;
    boolean language_selected = false;
    boolean english_caps_selected = false;

    @Override
    public View onCreateInputView() {
        keyboardView = (KeyboardView) getLayoutInflater().inflate(R.layout.keyboard, null);
        keyboard = new Keyboard(this, R.xml.qwerty);
        keyboardView.setKeyboard(keyboard);
        keyboardView.setOnKeyboardActionListener(this);
        return keyboardView;
    }

    @Override
    public void onPress(int primaryCode) {

    }

    @Override
    public void onRelease(int primaryCode) {

    }

    private void switchKeyboard(InputConnection inputConnection, int i){
        Log.d("DEBUG", "I: " + i);

        if((i != -2) && (i != -1) && (i != -6) && (i != -7) && (i != -8)){
            if((key_family != 0) && (key_family != i) && (i >= key_family - 5 && i <= key_family + 2)){
                if(first_time_selected == 0){
                    inputConnection.deleteSurroundingText(1, 0);
                }
                first_time_selected++;
                return;
            }
            if(i==32 || i==4963 || i==4962 || i==-4 ||i==-5){
                return;
            }
            if((i>=35&&i<=65)||(i>=4969&&i<=4988)||i==4667||i==123||i==125){

            }
        }
        Log.d("middle", "switchKeyboard: before switch");
        switch(i){
            case 4677:
            case 4672:
            case 4673:
            case 4674:
            case 4675:
            case 4676:
            case 4678:
            case 4679:
                key_family = 4677;
                first_time_selected = 0;
                keyboard = new Keyboard(this, R.xml.q_qwerty);
                keyboardView.setKeyboard(keyboard);
                keyboardView.setOnKeyboardActionListener(this);
                break;
            case 4688:
            case 4689:
            case 4690:
            case 4691:
            case 4692:
            case 4693:
            case 4694:
            case 4699:
                key_family = 4693;
                first_time_selected = 0;
                keyboard = new Keyboard(this, R.xml.qq_qwerty);
                keyboardView.setKeyboard(keyboard);
                keyboardView.setOnKeyboardActionListener(this);
                break;
            case 4813:
            case 4808:
            case 4809:
            case 4810:
            case 4811:
            case 4812:
            case 4814:
                key_family = 4812;
                first_time_selected = 0;
                keyboard = new Keyboard(this, R.xml.w_qwerty);
                keyboardView.setKeyboard(keyboard);
                keyboardView.setOnKeyboardActionListener(this);
                break;
            case 4768:
            case 4769:
            case 4770:
            case 4771:
            case 4772:
            case 4773:
            case 4774:
                key_family = 4774;
                first_time_selected = 0;
                keyboard = new Keyboard(this, R.xml.a_qwerty);
                keyboardView.setKeyboard(keyboard);
                keyboardView.setOnKeyboardActionListener(this);
                break;
            case 4816:
            case 4817:
            case 4818:
            case 4819:
            case 4820:
            case 4821:
            case 4822:
                key_family = 4720;
                first_time_selected = 0;
                keyboard = new Keyboard(this, R.xml.aa_qwerty);
                keyboardView.setKeyboard(keyboard);
                keyboardView.setOnKeyboardActionListener(this);
                break;
            case 4648:
            case 4649:
            case 4650:
            case 4651:
            case 4652:
            case 4653:
            case 4654:
            case 4655:
                key_family = 4653;
                first_time_selected = 0;
                keyboard = new Keyboard(this, R.xml.r_qwerty);
                keyboardView.setKeyboard(keyboard);
                keyboardView.setOnKeyboardActionListener(this);
                break;
            case 4720:
            case 4721:
            case 4722:
            case 4723:
            case 4724:
            case 4725:
            case 4726:
            case 4727:
                key_family = 4725;
                first_time_selected = 0;
                keyboard = new Keyboard(this, R.xml.t_qwerty);
                keyboardView.setKeyboard(keyboard);
                keyboardView.setOnKeyboardActionListener(this);
                break;
            case 4896:
            case 4897:
            case 4898:
            case 4899:
            case 4900:
            case 4901:
            case 4902:
            case 4903:
                key_family = 4901;
                first_time_selected = 0;
                keyboard = new Keyboard(this, R.xml.tt_qwerty);
                keyboardView.setKeyboard(keyboard);
                keyboardView.setOnKeyboardActionListener(this);
                break;
            case 4840:
            case 4841:
            case 4842:
            case 4843:
            case 4844:
            case 4845:
            case 4846:
                key_family = 4845;
                first_time_selected = 0;
                keyboard = new Keyboard(this, R.xml.y_qwerty);
                keyboardView.setKeyboard(keyboard);
                keyboardView.setOnKeyboardActionListener(this);
                break;
            case 4944:
            case 4945:
            case 4946:
            case 4947:
            case 4948:
            case 4949:
            case 4950:
            case 4951:
                key_family = 4774;
                first_time_selected = 0;
                keyboard = new Keyboard(this, R.xml.p_qwerty);
                keyboardView.setKeyboard(keyboard);
                keyboardView.setOnKeyboardActionListener(this);
                break;
            case 4912:
            case 4913:
            case 4914:
            case 4915:
            case 4916:
            case 4917:
            case 4918:
            case 4919:
                key_family = 4917;
                first_time_selected = 0;
                keyboard = new Keyboard(this, R.xml.pp_qwerty);
                keyboardView.setKeyboard(keyboard);
                keyboardView.setOnKeyboardActionListener(this);
                break;
            case 4656:
            case 4657:
            case 4658:
            case 4659:
            case 4660:
            case 4661:
            case 4662:
            case 4663:
                key_family = 4661;
                first_time_selected = 0;
                keyboard = new Keyboard(this, R.xml.s_qwerty);
                keyboardView.setKeyboard(keyboard);
                keyboardView.setOnKeyboardActionListener(this);
                break;
            case 4920:
            case 4921:
            case 4922:
            case 4923:
            case 4924:
            case 4925:
            case 4926:
            case 4927:
                key_family = 4925;
                first_time_selected = 0;
                keyboard = new Keyboard(this, R.xml.ss_qwerty);
                keyboardView.setKeyboard(keyboard);
                keyboardView.setOnKeyboardActionListener(this);
                break;
            case 4640:
            case 4641:
            case 4642:
            case 4643:
            case 4644:
            case 4645:
            case 4646:
            case 4647:
                key_family = 4645;
                first_time_selected = 0;
                keyboard = new Keyboard(this, R.xml.sss_qwerty);
                keyboardView.setKeyboard(keyboard);
                keyboardView.setOnKeyboardActionListener(this);
                break;
            case 4928:
            case 4929:
            case 4930:
            case 4931:
            case 4932:
            case 4933:
            case 4934:
            case 4935:
                key_family = 4933;
                first_time_selected = 0;
                keyboard = new Keyboard(this, R.xml.ssss_qwerty);
                keyboardView.setKeyboard(keyboard);
                keyboardView.setOnKeyboardActionListener(this);
                break;
            case 4853:
            case 4848:
            case 4849:
            case 4850:
            case 4851:
            case 4852:
            case 4854:
            case 4855:
                key_family = 4853;
                first_time_selected = 0;
                keyboard = new Keyboard(this, R.xml.d_qwerty);
                keyboardView.setKeyboard(keyboard);
                keyboardView.setOnKeyboardActionListener(this);
                break;
            case 4936:
            case 4937:
            case 4938:
            case 4939:
            case 4940:
            case 4941:
            case 4942:
            case 4943:
                key_family = 4941;
                first_time_selected = 0;
                keyboard = new Keyboard(this, R.xml.f_qwerty);
                keyboardView.setKeyboard(keyboard);
                keyboardView.setOnKeyboardActionListener(this);
                break;
            case 4872:
            case 4873:
            case 4874:
            case 4875:
            case 4876:
            case 4877:
            case 4878:
            case 4879:
                key_family = 4877;
                first_time_selected = 0;
                keyboard = new Keyboard(this, R.xml.g_qwerty);
                keyboardView.setKeyboard(keyboard);
                keyboardView.setOnKeyboardActionListener(this);
                break;
            case 4888:
            case 4889:
            case 4890:
            case 4891:
            case 4892:
            case 4893:
            case 4894:
            case 4895:
                key_family = 4893;
                first_time_selected = 0;
                keyboard = new Keyboard(this, R.xml.gg_qwerty);
                keyboardView.setKeyboard(keyboard);
                keyboardView.setOnKeyboardActionListener(this);
                break;
            case 4608:
            case 4609:
            case 4610:
            case 4611:
            case 4612:
            case 4613:
            case 4614:
                key_family = 4613;
                first_time_selected = 0;
                keyboard = new Keyboard(this, R.xml.h_qwerty);
                keyboardView.setKeyboard(keyboard);
                keyboardView.setOnKeyboardActionListener(this);
                break;
            case 4624:
            case 4625:
            case 4626:
            case 4627:
            case 4628:
            case 4629:
            case 4630:
            case 4631:
                key_family = 4629;
                first_time_selected = 0;
                keyboard = new Keyboard(this, R.xml.hh_qwerty);
                keyboardView.setKeyboard(keyboard);
                keyboardView.setOnKeyboardActionListener(this);
                break;
            case 4864:
            case 4865:
            case 4866:
            case 4867:
            case 4868:
            case 4869:
            case 4870:
            case 4871:
                key_family = 4869;
                first_time_selected = 0;
                keyboard = new Keyboard(this, R.xml.j_qwerty);
                keyboardView.setKeyboard(keyboard);
                keyboardView.setOnKeyboardActionListener(this);
                break;
            case 4776:
            case 4777:
            case 4778:
            case 4779:
            case 4780:
            case 4781:
            case 4782:
            case 4783:
                key_family = 4781;
                first_time_selected = 0;
                keyboard = new Keyboard(this, R.xml.k_qwerty);
                keyboardView.setKeyboard(keyboard);
                keyboardView.setOnKeyboardActionListener(this);
                break;
            case 4792:
            case 4793:
            case 4794:
            case 4795:
            case 4796:
            case 4797:
            case 4798:
            case 4799:
                key_family = 4797;
                first_time_selected = 0;
                keyboard = new Keyboard(this, R.xml.kk_qwerty);
                keyboardView.setKeyboard(keyboard);
                keyboardView.setOnKeyboardActionListener(this);
                break;
            case 4616:
            case 4617:
            case 4618:
            case 4619:
            case 4620:
            case 4621:
            case 4622:
            case 4623:
                key_family = 4621;
                first_time_selected = 0;
                keyboard = new Keyboard(this, R.xml.l_qwerty);
                keyboardView.setKeyboard(keyboard);
                keyboardView.setOnKeyboardActionListener(this);
                break;
            case 4824:
            case 4825:
            case 4826:
            case 4827:
            case 4828:
            case 4829:
            case 4830:
            case 4831:
                key_family = 4829;
                keyboard = new Keyboard(this, R.xml.z_qwerty);
                keyboardView.setKeyboard(keyboard);
                keyboardView.setOnKeyboardActionListener(this);
                break;
            case 4832:
            case 4833:
            case 4834:
            case 4835:
            case 4836:
            case 4837:
            case 4838:
            case 4839:
                key_family = 4837;
                keyboard = new Keyboard(this, R.xml.zz_qwerty);
                keyboardView.setKeyboard(keyboard);
                keyboardView.setOnKeyboardActionListener(this);
                break;
            case 4728:
            case 4729:
            case 4730:
            case 4731:
            case 4732:
            case 4733:
            case 4734:
            case 4735:
                key_family = 4733;
                first_time_selected = 0;
                keyboard = new Keyboard(this, R.xml.c_qwerty);
                keyboardView.setKeyboard(keyboard);
                keyboardView.setOnKeyboardActionListener(this);
                break;
            case 4904:
            case 4905:
            case 4906:
            case 4907:
            case 4908:
            case 4909:
            case 4910:
            case 4911:
                key_family = 4909;
                first_time_selected = 0;
                keyboard = new Keyboard(this, R.xml.cc_qwerty);
                keyboardView.setKeyboard(keyboard);
                keyboardView.setOnKeyboardActionListener(this);
                break;
            case 4712:
            case 4713:
            case 4714:
            case 4715:
            case 4716:
            case 4717:
            case 4718:
            case 4719:
                key_family = 4717;
                first_time_selected = 0;
                keyboard = new Keyboard(this, R.xml.v_qwerty);
                keyboardView.setKeyboard(keyboard);
                keyboardView.setOnKeyboardActionListener(this);
                break;
            case 4704:
            case 4705:
            case 4706:
            case 4707:
            case 4708:
            case 4709:
            case 4710:
            case 4711:
                key_family = 4709;
                first_time_selected = 0;
                keyboard = new Keyboard(this, R.xml.b_qwerty);
                keyboardView.setKeyboard(keyboard);
                keyboardView.setOnKeyboardActionListener(this);
                break;
            case 4752:
            case 4753:
            case 4754:
            case 4755:
            case 4756:
            case 4757:
            case 4758:
            case 4759:
                key_family = 4757;
                first_time_selected = 0;
                keyboard = new Keyboard(this, R.xml.n_qwerty);
                keyboardView.setKeyboard(keyboard);
                keyboardView.setOnKeyboardActionListener(this);
                break;
            case 4760:
            case 4761:
            case 4762:
            case 4763:
            case 4764:
            case 4765:
            case 4766:
            case 4767:
                key_family = 4765;
                first_time_selected = 0;
                keyboard = new Keyboard(this, R.xml.nn_qwerty);
                keyboardView.setKeyboard(keyboard);
                keyboardView.setOnKeyboardActionListener(this);
                break;
            case 4632:
            case 4633:
            case 4634:
            case 4635:
            case 4636:
            case 4637:
            case 4638:
            case 4639:
                key_family = 4637;
                first_time_selected = 0;
                keyboard = new Keyboard(this, R.xml.m_qwerty);
                keyboardView.setKeyboard(keyboard);
                keyboardView.setOnKeyboardActionListener(this);
                break;
            case 4664:
            case 4665:
            case 4666:
            case 4667:
            case 4668:
            case 4669:
            case 4670:
            case 4671:
                key_family = 4669;
                first_time_selected = 0;
                keyboard = new Keyboard(this, R.xml.x_qwerty);
                keyboardView.setKeyboard(keyboard);
                keyboardView.setOnKeyboardActionListener(this);
                break;
            case -1:
                if(shift_selected) {
                    key_family = -1;
                    shift_selected = false;
                    first_time_selected = 0;
                    keyboard = new Keyboard(this, R.xml.qwerty);
                    keyboardView.setKeyboard(keyboard);
                    keyboardView.setOnKeyboardActionListener(this);
                }else{
                    key_family = -1;
                    shift_selected = true;
                    first_time_selected = 0;
                    keyboard = new Keyboard(this, R.xml.shift_qwerty);
                    keyboardView.setKeyboard(keyboard);
                    keyboardView.setOnKeyboardActionListener(this);
                }
                break;
            case -2:
                if(number_selected) {
                    key_family = -2;
                    number_selected = false;
                    first_time_selected = 0;
                    keyboard = new Keyboard(this, R.xml.qwerty);
                    keyboardView.setKeyboard(keyboard);
                    keyboardView.setOnKeyboardActionListener(this);
                }else{
                    key_family = -2;
                    number_selected = true;
                    first_time_selected = 0;
                    keyboard = new Keyboard(this, R.xml.number_qwerty);
                    keyboardView.setKeyboard(keyboard);
                    keyboardView.setOnKeyboardActionListener(this);
                }
                break;
            case -6:
                Log.d(TAG, "switchKeyboard: -6");
                if(language_selected){
                    key_family = -6;
                    language_selected = false;
                    first_time_selected = 0;
                    keyboard = new Keyboard(this, R.xml.qwerty);
                    keyboardView.setKeyboard(keyboard);
                    keyboardView.setOnKeyboardActionListener(this);
                }else{
                    key_family = -6;
                    language_selected = true;
                    shift_selected = false;
                    first_time_selected = 0;
                    keyboard = new Keyboard(this, R.xml.english_qwerty);
                    keyboardView.setKeyboard(keyboard);
                    keyboardView.setOnKeyboardActionListener(this);
                }
                break;
            case -7:
                Log.d(TAG, "switchKeyboard: -7");
                key_family = -7;
                english_caps_selected = true;
                first_time_selected = 0;
                keyboard = new Keyboard(this, R.xml.english_caps_qwerty);
                keyboardView.setKeyboard(keyboard);
                keyboardView.setOnKeyboardActionListener(this);
                break;
            case -8:
                Log.d(TAG, "switchKeyboard: -8");
                key_family = -8;
                english_caps_selected = true;
                first_time_selected = 0;
                keyboard = new Keyboard(this, R.xml.english_qwerty);
                keyboardView.setKeyboard(keyboard);
                keyboardView.setOnKeyboardActionListener(this);
                break;
            case -44:
                key_family = -44;
                keyboard = new Keyboard(this, R.xml.emoji);
                keyboardView.setKeyboard(keyboard);
                keyboardView.setOnKeyboardActionListener(this);
                break;
        }
    }

    @Override
    public void onKey(int primaryCode, int[] keyCodes) {
        InputConnection inputConnection = getCurrentInputConnection();
        switchKeyboard(inputConnection, primaryCode);
        switch(primaryCode){
            case Keyboard.KEYCODE_DELETE:
                inputConnection.deleteSurroundingText(1, 0);
                break;
            case Keyboard.KEYCODE_DONE:
                inputConnection.sendKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_ENTER));
                break;
                default:
                    if(primaryCode == -2 || primaryCode == -1 || primaryCode == -7 || primaryCode == -6 || primaryCode == -8){
                        return;
                    }
                    char c = (char)primaryCode;
                    Log.d("text", "i: " + primaryCode);
                    inputConnection.commitText(String.valueOf(c), 1);

        }
    }

    private void playClick(int i){
        AudioManager audioManage = (AudioManager)getSystemService(AUDIO_SERVICE);
        switch(i){
            default:
                audioManage.playSoundEffect(audioManage.FX_KEYPRESS_STANDARD);
        }
    }

    @Override
    public void onText(CharSequence text) {

    }

    @Override
    public void swipeLeft() {

    }

    @Override
    public void swipeRight() {

    }

    @Override
    public void swipeDown() {

    }

    @Override
    public void swipeUp() {

    }
}
