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


class ThirdFragment : Fragment() {

    private val arguments : ThirdFragmentArgs by navArgs()
    lateinit var button3 : Button


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val usernameTextView = view.findViewById<TextView>(R.id.textName)
        usernameTextView.text = arguments.person.name

        button3 = view.findViewById(R.id.button_screen3)
        button3.setOnClickListener {
            val person = Person(
                name = usernameTextView.text.toString(),
                age = "",
                address = "",
                job = ""
            )
            findNavController().navigate(ThirdFragmentDirections.actionThirdFragmentToFourFragment(person))
        }



        //manggil dari fragmen 4
        val dataAge = arguments.person.age
        if(dataAge!="")
        {
            val usia = dataAge.toInt()
            val value : String
            if (usia != 0 ) {
                value = if (usia % 2 == 0) {
                    "$dataAge,DATA ANDA GENAP"
                } else {
                    "$dataAge, DATA ANDA GANJIL"
                }
                val ageTextView = view.findViewById<TextView>(R.id.textViewusia)
                ageTextView.text =value
            }
        }

        val addressTextView = view.findViewById<TextView>(R.id.textViewalamat)
        val jobTextView = view.findViewById<TextView>(R.id.textviewpekerjaan)


        addressTextView.text= arguments.person.address
        jobTextView.text = arguments.person.job

    }

}