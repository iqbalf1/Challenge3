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


class FourFragment : Fragment() {

    lateinit var button4 : Button
    private val arguments : FourFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_four, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val ageEditText = view.findViewById<EditText>(R.id.editTextusia)
        val addressEditText = view.findViewById<EditText>(R.id.editTextalamat)
        val jobEditText = view.findViewById<EditText>(R.id.editTextpekerjaan)
        button4 = view.findViewById(R.id.button_screen4)

        val usernameTextView = arguments.person.name

        button4.setOnClickListener {
            val person = Person(
                name = usernameTextView,
                age = ageEditText.text.toString(),
                address = addressEditText.text.toString(),
                job = jobEditText.text.toString()
            )
            findNavController().navigate(FourFragmentDirections.actionFourFragmentToThirdFragment(person))
        }
    }

}