package com.binar.navsample2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs


class SecondFragment : Fragment() {

    lateinit var button2 : Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val usernameEditText =view.findViewById<EditText>(R.id.editTextnama)
        button2 = view.findViewById(R.id.button_screen2)
        button2.setOnClickListener {
            val person = Person(
                name = usernameEditText.text.toString(),
                age = "",
                address = "",
                job = ""
            )
            findNavController().navigate(SecondFragmentDirections.actionSecondFragmentToThirdFragment(
                person))
        }

    }
}