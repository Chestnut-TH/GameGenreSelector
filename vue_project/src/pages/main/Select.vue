<template>
    <div>
        <button @click="roulette" type="button" class="btn btn-primary">Start</button>
        <table class="table">
            <thead>
                <tr>
                <th scope="col">No.</th>
                <th scope="col">ジャンル</th>
                <th scope="col">対象</th>
                <th scope="col">特徴1</th>
                <th scope="col">特徴2</th>
                <th scope="col">特徴3</th>
                </tr>
            </thead>
            <tbody>   
                <tr  v-for="item in items" :key="item.message">
                    <th scope="row">{{item.no}}</th>
                    <td>{{item.genre}}</td>
                    <td>{{item.target}}</td>
                    <td>{{item.feature1}}</td>
                    <td>{{item.feature2}}</td>
                    <td>{{item.feature3}}</td>
                </tr>   
            </tbody>
        </table>
    </div>
</template>
<script>
    import axios from 'axios';

    export default {
        data(){
            return{
                items: [
                    {   
                        no:"",
                        genre: '',
                        target: '',
                        feature1: '',
                        feature2: '',
                        feature3: ''
                    },
                ]
            }
        },
        methods: {
            roulette (){
                axios
                .get('http://localhost:8080/roulette')
                .then(
                    response => {
                        for (let i=0; i<response.data.length; i++) {
                            this.items.push(response.data[i]);
                        }
                        console.log(this.items);
                    }  
                )
            }
        }
    }
</script>

