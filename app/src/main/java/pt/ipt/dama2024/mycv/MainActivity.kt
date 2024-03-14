package pt.ipt.dama2024.mycv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ScrollView
import android.widget.TextView
import androidx.transition.Visibility

class MainActivity : AppCompatActivity() {
    /**
     * Todas as classes, funções e afins deverão ser devidamente comentadas
     *
     * On create -> first function to be executed
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
// this is a comment line...
// add some code to 'find' the button btn_show_cv
findViewById<Button>(R.id.btn_show_cv).setOnClickListener {
    showCV(it)
}

    }

    /**
     * change the content at the interface
     *
     * @param view - reference to the interface
     */


    private fun showCV(view: View) {
        // write the instructions that the function will do...

        /* algorithm
        * 1. assign the user's nickname to first line of text
        * 2. turn invisible the text box and button
        * 3. turn visible the CV
        * 4. hide keyboard
        */

        // add 'pointers' to objects presented at interface
        // to change their behavior
        val auxBtNickname = findViewById<Button>(R.id.btn_show_cv)
        val auxTxtNickname = findViewById<EditText>(R.id.editText_nickname)
        val auxLabelQuestion = findViewById<TextView>(R.id.textView_ask_4_nickname)
        val auxLabelCV = findViewById<ScrollView>(R.id.show_CV)

        // 1.
        auxLabelQuestion.text=auxBtNickname.text
        auxLabelQuestion.gravity=Gravity.CENTER

        // 2.
        auxBtNickname.visibility=View.GONE
        auxTxtNickname.visibility=View.GONE

        // 3.
        auxLabelCV.visibility=View.VISIBLE

        // 4.
        val imm=getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.windowToken,0)

    }

}