package com.vagif_tagiyev.examproject

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.button.MaterialButton


class PassengerFragment : Fragment() {
   private lateinit var callBtn: MaterialButton
   private lateinit var sorguBtn:MaterialButton
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_passenger, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        super.onViewCreated(view, savedInstanceState)

        callBtn = view.findViewById(R.id.call_btn)
        sorguBtn = view.findViewById(R.id.sorgu_btn)

        sorguBtn.setOnClickListener(){
            Toast.makeText(requireContext(),"Sorgu Gonderildi",Toast.LENGTH_SHORT).show()




        }

        callBtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "+994515667553"))
            startActivity(intent)


        }

    }


}