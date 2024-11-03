package com.example.signinandsignup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
class SignInFragment: Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_sign_in, container, false)

        val loginButton = view.findViewById<Button>(R.id.loginButton)
        loginButton.setOnClickListener {

        }

        return view
    }
}
