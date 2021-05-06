package com.example.workwithkotlin
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.workwithkotlin.fragments.ConstraintFragment
import com.example.workwithkotlin.fragments.LinnerFragment
import kotlinx.android.synthetic.main.activity_show_inform.*

class ShowInformActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_inform)
        val userEmail = intent.getStringExtra(USER_EMAIL)
        val userPassword = intent.getStringExtra(USER_PASSWORD)
        //val text1: String = "Email: $userEmail\n" + "Password: $userPassword"
        //textView.text = "Email: $userEmail\nPassword: $userPassword"

        val bundle = Bundle()
        bundle.putString("text", "Email: $userEmail\n" + "Password: $userPassword")
        ConstraintFragment.getNewInstance(args = bundle)

        val constraintFragment = ConstraintFragment()
        val linnerFragment = LinnerFragment()
        makeCurrentFragment(constraintFragment)
        bottom_navigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.circle_green -> makeCurrentFragment(constraintFragment)
                R.id.circle_yellow -> makeCurrentFragment(linnerFragment)
            }
            true
        }
    }

    private fun makeCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_wrapper, fragment)
            commit()
        }
}


