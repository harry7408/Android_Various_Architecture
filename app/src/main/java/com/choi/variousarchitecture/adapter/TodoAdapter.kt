package com.choi.variousarchitecture.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.choi.variousarchitecture.data.TodoDto
import com.choi.variousarchitecture.databinding.ItemTodoListBinding

class TodoAdapter : ListAdapter<TodoDto,TodoAdapter.TodoViewHolder>(diffUtil) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        return TodoViewHolder(
            ItemTodoListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        )
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder.bind(currentList[position])
    }

    inner class TodoViewHolder(private val binding:ItemTodoListBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(item : TodoDto) {

        }
    }


    companion object {
        val diffUtil=object : DiffUtil.ItemCallback<TodoDto>() {
            override fun areItemsTheSame(oldItem: TodoDto, newItem: TodoDto): Boolean {
                TODO("Not yet implemented")
            }

            override fun areContentsTheSame(oldItem: TodoDto, newItem: TodoDto): Boolean {
                TODO("Not yet implemented")
            }

        }
    }


}