package com.example.kentsimgeleri

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kentsimgeleri.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!
    private lateinit var landmarkList : ArrayList<Landmark>
    private lateinit var adapter : LandmarkAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        landmarkList = ArrayList()
        val gaziantepKalesi = Landmark(name = "Gaziantep Kalesi", cityName = "Gaziantep", image = R.drawable.gaziantepkalesi)
        val nemrutDagi = Landmark(name = "Nemrut Dağı", cityName = "Adıyaman", image = R.drawable.nemrutdagi)
        val arslantepeHoyugu = Landmark(name = "Arslantepe Höyüğü", cityName = "Malatya", image = R.drawable.arslantepehoyugu)
        val saintPierreKilisesi = Landmark(name = "St Pierre Kilisesi", cityName = "Hatay", image = R.drawable.saintpierrekilisesi)
        val gobeklitepe = Landmark(name = "Göbeklitepe", cityName = "Şanlıurfa", image = R.drawable.gobeklitepe)
        val ceyhanKoprusu = Landmark(name = "Ceyhan Köprüsü", cityName = "Kahramanmaraş", image = R.drawable.ceyhankoprusu)
        val sulukluHan = Landmark(name = "Sülüklü Han", cityName = "Diyarbakır", image = R.drawable.sulukluhan)
        val adanaSaatKulesi = Landmark(name = "Saat Kulesi", cityName = "Adana", image = R.drawable.adanasaatkulesi)

        landmarkList.add(gaziantepKalesi)
        landmarkList.add(nemrutDagi)
        landmarkList.add(arslantepeHoyugu)
        landmarkList.add(saintPierreKilisesi)
        landmarkList.add(gobeklitepe)
        landmarkList.add(ceyhanKoprusu)
        landmarkList.add(sulukluHan)
        landmarkList.add(adanaSaatKulesi)

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        val view = binding.root
        //
        binding.landmarkRecyclerView.layoutManager = LinearLayoutManager(view.context)
        val adapter = LandmarkAdapter(landmarkList)
        binding.landmarkRecyclerView.adapter = adapter
        //
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}